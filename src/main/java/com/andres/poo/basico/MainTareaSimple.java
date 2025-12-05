package com.andres.poo.basico;

public class MainTareaSimple {
	public static void main(String[] args) {
		TareaSimple objeto1 = new TareaSimple();
		objeto1.titulo = "Nueva tarea";
		System.out.println(objeto1.titulo);
		TareaSimple objeto2 = new TareaSimple("Otra tarea", false);
		System.out.println(objeto2.titulo);
	}

}
