package com.gcpglobal.josess.app;


import com.gcpglobal.josess.beans.Vehiculo;


public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculo objVehiculo01 = new Vehiculo("MAZ-1510", "OFICIAL");
		objVehiculo01.save();

		Vehiculo objVehiculo02 = new Vehiculo("MAZ-9090", "RESIDENTE");
		objVehiculo02.save();

		Vehiculo objVehiculo03 = new Vehiculo("MAZ-0909", "NO-RESIDENTE");
		objVehiculo03.save();
	}

}
