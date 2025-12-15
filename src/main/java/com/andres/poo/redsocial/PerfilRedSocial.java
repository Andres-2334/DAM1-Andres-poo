package com.andres.poo.redsocial;

import java.util.ArrayList;

public class PerfilRedSocial {
	
	private String nombreUsuario;
	
	private String nombre;
	
	private String biografia;
	
	private String ciudad;
	
	private int numeroSeguidores;
	
	private int numeroPublicaciones;
	
	private Estado estado;
	
	private boolean cuentaVerificada;
	
	private ArrayList<Publicacion> publicaciones;
		

	public PerfilRedSocial() {
		super();
		this.publicaciones = new ArrayList<>();
	}

	public PerfilRedSocial(String nombreUsuario, String nombre, String biografia, String ciudad, int numeroSeguidores,
			int numeroPublicaciones, Estado estado, boolean cuentaVerificada) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.nombre = nombre;
		this.biografia = biografia;
		this.ciudad = ciudad;
		this.numeroSeguidores = numeroSeguidores;
		this.numeroPublicaciones = numeroPublicaciones;
		this.estado = estado;
		this.cuentaVerificada = cuentaVerificada;
		this.publicaciones = new ArrayList<>();
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getNumeroSeguidores() {
		return numeroSeguidores;
	}

	public void setNumeroSeguidores(int numeroSeguidores) {
		this.numeroSeguidores = numeroSeguidores;
	}

	public int getNumeroPublicaciones() {
		return numeroPublicaciones;
	}

	public void setNumeroPublicaciones(int numeroPublicaciones) {
		this.numeroPublicaciones = numeroPublicaciones;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public boolean isCuentaVerificada() {
		return cuentaVerificada;
	}

	public void setCuentaVerificada(boolean cuentaVerificada) {
		this.cuentaVerificada = cuentaVerificada;
	}
	
	public void mostrarInformacion() {
		System.out.println(this.nombre+" (@"+this.nombreUsuario+")");
	}
	
	
	public void addSeguidores(int numeroSeguidores) {
		this.numeroSeguidores+=numeroSeguidores;
	}
	
	public boolean isActivo() {
		return this.estado==Estado.ESTADO_ACTIVADO;
	}

	public ArrayList<Publicacion> getPublicaciones() {
		return publicaciones;
	}

	public void setPublicaciones(ArrayList<Publicacion> publicaciones) {
		this.publicaciones = publicaciones;
	}
	
	public void crearPublicacion(String mensaje) {
		Publicacion p = new Publicacion(mensaje);
		this.publicaciones.add(p);
	}
	
	public void mostrarPublicaciones() {
		this.publicaciones.stream().forEach(p->p.mostrar());
	}
	
	
	

}