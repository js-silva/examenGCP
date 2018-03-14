package com.gcpglobal.josess;


import java.util.StringBuilder;


public class Vehiculo implements VehiculoInterfaz
{
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


	public Vehiculo(String numeroPlaca)
	{
		super();

		this.numeroPlaca = numeroPlaca;
	}


	public void registrarEntrada( Estancia objEstancia )
	{
		this.getEstancia.setHoraEntrada = objEstancia.getHoraEntrada;
	}

	public void registrarSalida( Estancia objEstancia )
	{
		this.getEstancia.setHoraSalida = objEstancia.getHoraSalida;
	}

	public int acumularTiempo()
	{
		this.tiempoAcumulado = this.tiempoAcumulado + Util.difEnMinutos( this.getHoraSalida - this.getHoraEntrada );
		return this.tiempoAcumulado;
	}
	public int reiniciarTiempoAcumulado()
	{
		this.tiempoAcumulado = 0;
	}

	public double importeAPagar()
	{
		this.tiempoAcumulado += Util.difEnMinutos( this.getHoraSalida - this.getHoraEntrada );

		if( this.tipoVehiculo.equals("OFICIAL") )
		{
			this.importeAPagar = this.tiempoAcumulado * 0;
		} elseif( this.tipoVehiculo.equals("RESIDENTE") )
		{
			this.importeAPagar = this.tiempoAcumulado * 0.05;
		} elseif( this.tipoVehiculo.equals("NO-RESIDENTE") )
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

}
