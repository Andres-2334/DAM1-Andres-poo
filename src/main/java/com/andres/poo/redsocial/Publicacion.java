package com.andres.poo.redsocial;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Publicacion {
	
	private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
	
	private String mensaje;
	
	private LocalDateTime hora;
	
	private int numeroLikes;
	

	public Publicacion(String mensaje) {
		this.mensaje = mensaje;
		this.numeroLikes = 0;
		this.hora = LocalDateTime.now();
	}


	public Publicacion(String mensaje, LocalDateTime hora, int numeroLikes) {
		super();
		this.mensaje = mensaje;
		this.hora = hora;
		this.numeroLikes = numeroLikes;
	}


	public Publicacion() {
		super();
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public LocalDateTime getHora() {
		return hora;
	}

	public void setHora(LocalDateTime hora) {
		this.hora = hora;
	}

	public int getNumeroLikes() {
		return numeroLikes;
	}

	public void setNumeroLikes(int numeroLikes) {
		this.numeroLikes = numeroLikes;
	}
	
	public void mostrar() {
		System.out.printf("[ %s ] %s (%d likes)%n", this.formatearHora(),this.mensaje,this.numeroLikes);
	}
	
	private String formatearHora() {
		return this.hora.format(DATE_TIME_FORMATTER);
	}
	
	public void darMeGusta() {
		this.numeroLikes++;
	}
	
	
	/**
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		ldt = ldt.plusHours(12);
		System.out.println(ldt);
		System.out.println(ldt.format(DateTimeFormatter.ofPattern("dd-MM-yyyy - HH:mm:ss")));
		System.out.println(ldt.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy - HH:mm:ss")));
		System.out.println(ldt.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy - hh:mm:ss")));
		
		Publicacion p = new Publicacion("Este mensaje es de prueba");
		p.mostrar();
		p.darMeGusta();
		p.mostrar();
		
	}
	**/
	
	
	

}