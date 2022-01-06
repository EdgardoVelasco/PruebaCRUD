package com.netec.app.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.netec.app.entities.Articulo;

public interface iArticuloDAO extends CrudRepository<Articulo, Integer>{
	
	@Query("select u from Articulo u where u.nombre=:nombre")
	public Articulo findByName(@Param("nombre") String name);

}
