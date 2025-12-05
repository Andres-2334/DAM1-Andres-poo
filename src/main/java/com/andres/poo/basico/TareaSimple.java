package com.andres.poo.basico;

public class TareaSimple {
	
String titulo;
private boolean completado;
	String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public boolean isCompletado() {
	return completado;
}
public void setCompletado(boolean completado) {
	this.completado = completado;
}
public TareaSimple(String titulo, boolean completado) {
	super();
	this.titulo = titulo;
	this.completado = completado;
}
public TareaSimple() {
	
}

public void mostrarTarea(){
	if (!completado) {
		System.out.println("La tarea " + titulo + " No esta completada");
	} else if (completado) {
		System.out.println("La tarea " + titulo + "Esta completada");
	}
}

public void cambiarEstado() {
	this.completado = !completado;
}
}
