package com.gcpglobal.josess.utils;


import	java.util.Calendar;


public class Estancia
{
	private			Calendar			tsEntrada 		= null;
	private			Calendar			tsSalida 		= null;


	public Estancia()
	{
		this( Calendar.getInstance(), Calendar.getInstance() );
	}
	public Estancia( Calendar tsEntrada, Calendar tsSalida )
	{
		super();

		this.tsEntrada	= tsEntrada;
		this.tsSalida	= tsSalida;
	}


	public Calendar getTsEntrada() {
		return tsEntrada;
	}
	public void setTsEntrada(Calendar tsEntrada) {
		this.tsEntrada = tsEntrada;
	}

	public Calendar getTsSalida() {
		return tsSalida;
	}
	public void setTsSalida(Calendar tsSalida) {
		this.tsSalida = tsSalida;
	}


}
