package com.gcpglobal.josess;


import	java.util.Calendar;


public class Estancia
{
	private			Calendar			horaEntrada 	= null;
	private			Calendar			horaSalida 		= null;


	public Estancia()
	{
		this(Calendar.getInstance(), Calendar.getInstance());
	}
	public Estancia( Calendar horaEntrada, Calendar horaSalida )
	{
		super();

		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
	}

	public void setHoraEntrada( Calendar horaEntrada )
	{
		this.horaEntrada = horaEntrada;
	}
	public Calendar getHoraEntrada()
	{
		return this.horaEntrada;
	}

	public void setHoraSalida( Calendar horaSalida )
	{
		this.horaSalida = horaSalida;
	}
	public Calendar getHoraSalida()
	{
		return this.horaSalida;
	}

}
