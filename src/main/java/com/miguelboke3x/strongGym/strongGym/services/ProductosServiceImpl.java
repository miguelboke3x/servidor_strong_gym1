package com.miguelboke3x.strongGym.strongGym.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miguelboke3x.strongGym.strongGym.entities.Productos;
import com.miguelboke3x.strongGym.strongGym.repository.IProductosRepository;

@Service
public class ProductosServiceImpl implements IProductosService {

	@Autowired
	IProductosRepository repo;

	@Override
	public void addProductos(Productos e) {
		repo.save(e);

	}

	@Override
	public List<Productos> findAll() {
		return repo.findAll();
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);

	}

}