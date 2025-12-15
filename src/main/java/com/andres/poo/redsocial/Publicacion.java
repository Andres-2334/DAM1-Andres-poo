package com.andres.poo.redsocial;

import java.time.LocalTime;

public class Publicacion {
	private LocalTime hora;
	private int numeroLikes; 
	private String contenido;

	public Publicacion(String contenido) {
		this.contenido = contenido;
		this.hora = LocalTime.now();
		this.numeroLikes = 0;
	}

	public void mostrar() {
		System.out.println(numeroLikes);
		System.out.println(hora);
		System.out.println(contenido);
	}
	
	public void enviarLike() {
		numeroLikes += 1;
	}
	
	public int verMeGusta() {
		return numeroLikes;
	}
}
