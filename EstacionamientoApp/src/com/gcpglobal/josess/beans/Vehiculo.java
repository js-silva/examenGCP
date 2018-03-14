package com.gcpglobal.josess.beans;


import java.lang.StringBuilder;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.gcpglobal.josess.utils.Estancia;
import com.gcpglobal.josess.utils.HibernateUtil;
import com.gcpglobal.josess.utils.Util;


public class Vehiculo implements VehiculoInterfaz
{
	private 		String		numeroPlaca		= null;

	private 		String		tipoVehiculo	= null;
	//Oficial, Residente, NoResidente

	private 		Estancia	estancia		= null;
	private 		int			tiempoAcumulado	= 0;
	private 		double		importeAPagar	= 0.00;


	public String getNumeroPlaca()
	{
		return this.numeroPlaca;
	}
	public void setNumeroPlaca( String numeroPlaca )
	{
		this.numeroPlaca = numeroPlaca;
	}

	public String getTipoVehiculo()
	{
		return this.tipoVehiculo;
	}
	public void setTipoVehiculo( String tipoVehiculo )
	{
		this.tipoVehiculo = tipoVehiculo;
	}

	public Estancia getEstancia()
	{
		return this.estancia;
	}
	public void setEstancia( Estancia estancia )
	{
		this.estancia = estancia;
	}

	public int getTiempoAcumulado()
	{
		return this.tiempoAcumulado;
	}
	public void setTiempoAcumulado( int tiempoAcumulado )
	{
		this.tiempoAcumulado = tiempoAcumulado;
	}

	public double getImporteAPagar()
	{
		return this.importeAPagar;
	}
	public void setImporteAPagar( double importeAPagar )
	{
		this.importeAPagar = importeAPagar;
	}


	public Vehiculo(String numeroPlaca, String tipoVehiculo)
	{
		super();

		this.setNumeroPlaca( numeroPlaca );
		this.setTipoVehiculo( tipoVehiculo );
	}


	public void registrarEntrada( Estancia objEstancia )
	{
		this.getEstancia().setTsEntrada( objEstancia.getTsEntrada() );
	}

	public void registrarSalida( Estancia objEstancia )
	{
		this.getEstancia().setTsSalida( objEstancia.getTsSalida() );
	}

	public void acumularTiempo()
	{
		this.tiempoAcumulado += Util.difEnMinutos( this.getEstancia() );
	}
	public void reiniciarTiempoAcumulado()
	{
		this.tiempoAcumulado = 0;
	}

	public double importeAPagar()
	{
		this.tiempoAcumulado += Util.difEnMinutos( this.getEstancia() );

		if( this.tipoVehiculo.equals("OFICIAL") )
		{
			this.importeAPagar = this.tiempoAcumulado * 0;
		} else if( this.tipoVehiculo.equals("RESIDENTE") )
		{
			this.importeAPagar = this.tiempoAcumulado * 0.05;
		} else if( this.tipoVehiculo.equals("NO-RESIDENTE") )
		{
			this.importeAPagar = this.tiempoAcumulado * 0.5;
		}

		return this.importeAPagar;
	}

	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append( this.getNumeroPlaca() );
		sb.append( "          " );
		sb.append( this.getTiempoAcumulado() );
		sb.append( "          " );
		sb.append( this.importeAPagar() );

		return sb.toString();
	}


	public Vehiculo save()
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
			session.save( this );
		session.getTransaction().commit();
		session.close();

		return this;
	}


}
