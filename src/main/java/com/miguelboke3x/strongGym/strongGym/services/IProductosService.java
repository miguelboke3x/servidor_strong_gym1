package com.miguelboke3x.strongGym.strongGym.services;

import java.util.List;


import com.miguelboke3x.strongGym.strongGym.entities.Productos;



public interface IProductosService {
	public void addProductos(Productos e);

	public List<Productos> findAll();
	public void delete(Integer id);

}
