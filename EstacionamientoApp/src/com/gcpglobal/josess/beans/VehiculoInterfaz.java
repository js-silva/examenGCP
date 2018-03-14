package com.gcpglobal.josess.beans;

import com.gcpglobal.josess.utils.Estancia;

public interface VehiculoInterfaz
{
	public 		void		registrarEntrada( Estancia objEstancia );
	public		void		registrarSalida( Estancia objEstancia );

	public		void		acumularTiempo();
	public		void		reiniciarTiempoAcumulado();

	public		double		importeAPagar();


}
