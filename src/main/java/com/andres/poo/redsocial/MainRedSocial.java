package com.andres.poo.redsocial;

import java.util.ArrayList;
import java.util.List;

import com.andres.poo.redsocial.GeneradorPerfiles;


public class MainRedSocial {
	
	PerfilRedSocial p1 = GeneradorPerfiles.crearPerfilPrueba("juan");
	PerfilRedSocial p2 = GeneradorPerfiles.crearPerfilPrueba("luis", 3);
	PerfilRedSocial p3 = GeneradorPerfiles.crearPerfilPrueba("simon");
	
	private ArrayList<PerfilRedSocial> perfiles = new ArrayList<>();
	{
	perfiles.add(p1);
	perfiles.add(p2);
	perfiles.add(p3);
	perfiles.forEach(perfil -> perfil.mostrarInformacion());
	perfiles.forEach(perfil -> perfil.mostrarPublicaciones());
	
	
	}
	
	
	
	

}
