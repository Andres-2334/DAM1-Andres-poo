package com.andres.poo.redsocial;

public class PerfilRedSocial {
String nombreusuario;
String nombrevisible;
String biografia;
String ciudad;
int numseguidores;
int numpublicaciones;
Estado estadoperfil;
boolean verificado;

public void mostrarinfo() {
	System.out.println("nombre: " + nombreusuario);
	System.out.println("nombre visible: " + nombrevisible );
	System.out.println("biografia: " + biografia);
	System.out.println("ciudad: " + ciudad);
	System.out.println("Seguidores: " + numseguidores);
	System.out.println("publicaciones: " + numpublicaciones);
	System.out.println("Estado: " + estadoperfil);
	System.out.println("Verificacion: " + verificado);
}

public void añadirSeguidores(int seguidores) {
	numseguidores += seguidores;
}
public void cambiarEstado(Estado cambio) {
	estadoperfil = cambio;
}
public boolean estaActivo() {
	return estadoperfil==Estado.ESTADO_ACTIVADO;

}

}
