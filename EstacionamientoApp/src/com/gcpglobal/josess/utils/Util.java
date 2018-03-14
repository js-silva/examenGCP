package com.gcpglobal.josess.utils;


import java.util.Calendar;


public class Util
{
	public static int difEnMinutos( Estancia objEstancia )
	{
		return Util.difEnMinutos( objEstancia.getTsEntrada(), objEstancia.getTsSalida() );
	}

	private static int difEnMinutos( Calendar tsI, Calendar tsF )
	{
		return tsF.get(Calendar.MINUTE) - tsI.get(Calendar.MINUTE);
	}


}
