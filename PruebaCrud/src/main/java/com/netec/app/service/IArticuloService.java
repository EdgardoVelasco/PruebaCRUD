package com.netec.app.service;

import java.util.List;

import com.netec.app.entities.Articulo;

public interface IArticuloService {
   public Articulo insert(Articulo art);
   public List<Articulo> selectAll();
   public Articulo selectByName(String name);
	
}
