package com.netec.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netec.app.dao.iArticuloDAO;
import com.netec.app.entities.Articulo;

@Service
public class ArticuloServiceImpl implements IArticuloService{
	@Autowired
	private iArticuloDAO dao;

	@Override
	public Articulo insert(Articulo art) {
		
		return dao.save(art);
	}

	@Override
	public List<Articulo> selectAll() {
			return (List<Articulo>)dao.findAll();
	}

	@Override
	public Articulo selectByName(String name) {
		
		return dao.findByName(name);
	}

}
