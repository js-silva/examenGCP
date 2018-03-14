package com.gcpglobal.josess;


public interfaz VehiculoInterfaz
{
	private 	String		numeroPlaca;

	private		String		tipoVehiculo;
	//Oficial, Residente, NoResidente

	private		Estancia	objEstancia;
	private		int			tiempoAcumulado;
	private		double		importeAPagar;


	public 		void		registrarEntrada( Estancia objEstancia );
	public		void		registrarSalida( Estancia objEstancia );

}
