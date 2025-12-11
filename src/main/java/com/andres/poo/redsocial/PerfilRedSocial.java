package com.andres.poo.redsocial;
import java.util.ArrayList;

public class PerfilRedSocial {
private String nombreusuario;
private String nombrevisible;
private String biografia;
private String ciudad;
private int numseguidores;
private int numpublicaciones;
private Estado estadoperfil;
private boolean verificado;
private ArrayList<Publicacion> listapublicaciones = new ArrayList<>();

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

public void crearPublicacion() {
	Publicacion publicacion = new Publicacion();
	listapublicaciones.add(publicacion);
}
public void mostrarPublicacion() {
	System.out.println(listapublicaciones.iterator());
}
}
