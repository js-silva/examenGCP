package com.gcpglobal.josess;


import java.util.HashMap;
import java.util.Iterator;


public class AppMain()
{
	public HashMap<String, VehiculoInterfaz> listaOficiales		= new HashMap<String, Vehiculo>();
	public HashMap<String, VehiculoInterfaz> listaResidentes 	= new HashMap<String, Vehiculo>();
	public HashMap<String, VehiculoInterfaz> listaNoResidentes 	= new HashMap<String, Vehiculo>();


	public void altaVehiculoOficial()
	{
		//SE DEBERÍA VALIDAR EL VEHICULO A DAR DE ALTA NO EXISTA EN LA LISTA DE VEHICULOS OFICIALES
		//SUPONGAMOS QUE NO EXISTE EN LA LISTA

		//SE CREA EL VEHICULO
		VehiculoInterfaz objVehiculo = new Vehiculo( new String("MAZ-1510") );
		objVehiculo.setTipoVehiculo( "OFICIAL" );

		//SE AGREGA EN LA LISTA DE VEHICULOS OFICIALES
		listaOficiales.put( objVehiculo.getNumeroPlaca(), objVehiculo );
	}

	public void altaVehiculoResidente()
	{
		//SE DEBERÍA VALIDAR EL VEHICULO A DAR DE ALTA NO EXISTA EN LA LISTA DE VEHICULOS DE RESIDENTES
		//SUPONGAMOS QUE NO EXISTE EN LA LISTA

		//SE CREA EL VEHICULO
		VehiculoInterfaz objVehiculo = new Vehiculo( new String("MAZ-9090") );
		objVehiculo.setTipoVehiculo( "RESIDENTE" );

		//SE AGREGA EN LA LISTA DE VEHICULOS DE RESIDENTES
		listaResidentes.put( objVehiculo.getNumeroPlaca(), objVehiculo );
	}

	public void altaVehiculoNoResidente()
	{
		//SE DEBERÍA VALIDAR EL VEHICULO A DAR DE ALTA NO EXISTA EN LA LISTA DE VEHICULOS DE NO RESIDENTES
		//SUPONGAMOS QUE NO EXISTE EN LA LISTA

		//SE CREA EL VEHICULO
		VehiculoInterfaz objVehiculo = new Vehiculo( new String("MAZ-0909") );
		objVehiculo.setTipoVehiculo( "NO-RESIDENTE" );

		//SE AGREGA EN LA LISTA DE VEHICULOS DE RESIDENTES
		listaNoResidentes.put( objVehiculo.getNumeroPlaca(), objVehiculo );
	}

	public void comienzaMes()
	{
		listaOficiales = new HashMap<String, Vehiculo>();

		Iterator<Vehiculo> itVehiculosResidentes = listaResidentes.values().iterator();
		while( itVehiculosResidentes.hasNext() )
		{
			Vehiculo objVehiculo = itVehiculosResidentes.next();
			objVehiculo.reiniciarTiempoAcumulado();
		}
	}

	public String reportePagoResidentes()
	{
		Iterator<Vehiculo> itVehiculosResidentes = listaResidentes.values().iterator();

		System.out.println( "Núm. Placa          Tiempo Acumulado          Importe a pagar" );
		while( itVehiculosResidentes.hasNext() )
		{
			Vehiculo objVehiculo = itVehiculosResidentes.next();
			System.out.println( objVehiculo.toString() );
		}
	}

}
