package com.gcpglobal.josess.app;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.gcpglobal.josess.beans.Vehiculo;
import com.gcpglobal.josess.beans.VehiculoInterfaz;


public class EstacionamientoApp
{
	Map<String, VehiculoInterfaz> listaOficiales		= new HashMap<String, VehiculoInterfaz>();
	Map<String, VehiculoInterfaz> listaResidentes		= new HashMap<String, VehiculoInterfaz>();
	Map<String, VehiculoInterfaz> listaNoResidentes		= new HashMap<String, VehiculoInterfaz>();


	public void altaVehiculoOficial()
	{
		//SE DEVERÁ VALIDAR EL VEHICULO A DAR DE ALTA NO EXISTA EN LA LISTA DE VEHICULOS OFICIALES
		//SUPONGAMOS QUE NO EXISTE EN LA LISTA

		//SE CREA EL VEHICULO
		Vehiculo objVehiculo = new Vehiculo( new String("MAZ-1510"), "OFICIAL" );

		//SE AGREGA EN LA LISTA DE VEHICULOS OFICIALES
		listaOficiales.put( objVehiculo.getNumeroPlaca(), objVehiculo );
	}

	public void altaVehiculoResidente()
	{
		//SE DEBERÁ VALIDAR EL VEHICULO A DAR DE ALTA NO EXISTA EN LA LISTA DE VEHICULOS DE RESIDENTES
		//SUPONGAMOS QUE NO EXISTE EN LA LISTA

		//SE CREA EL VEHICULO
		Vehiculo objVehiculo = new Vehiculo( new String("MAZ-9090"), "RESIDENTE" );

		//SE AGREGA EN LA LISTA DE VEHICULOS DE RESIDENTES
		listaResidentes.put( objVehiculo.getNumeroPlaca(), objVehiculo );
	}

	public void altaVehiculoNoResidente()
	{
		//SE DEBERÁ VALIDAR EL VEHICULO A DAR DE ALTA NO EXISTA EN LA LISTA DE VEHICULOS DE NO RESIDENTES
		//SUPONGAMOS QUE NO EXISTE EN LA LISTA

		//SE CREA EL VEHICULO
		Vehiculo objVehiculo = new Vehiculo( new String("MAZ-0909"), "NO-RESIDENTE" );

		//SE AGREGA EN LA LISTA DE VEHICULOS DE RESIDENTES
		listaNoResidentes.put( objVehiculo.getNumeroPlaca(), objVehiculo );
	}

	public void comienzaMes()
	{
		listaOficiales = new HashMap<String, VehiculoInterfaz>();

		Iterator<VehiculoInterfaz> itVehiculosResidentes = listaResidentes.values().iterator();
		while( itVehiculosResidentes.hasNext() )
		{
			VehiculoInterfaz objVehiculo = itVehiculosResidentes.next();
			objVehiculo.reiniciarTiempoAcumulado();
		}
	}

	public void reportePagoResidentes()
	{
		Iterator<VehiculoInterfaz> itVehiculosResidentes = listaResidentes.values().iterator();

		System.out.println( "Núm. Placa          Tiempo Acumulado          Importe a pagar" );
		while( itVehiculosResidentes.hasNext() )
		{
			VehiculoInterfaz objVehiculo = itVehiculosResidentes.next();
			System.out.println( objVehiculo.toString() );
		}
	}


}
