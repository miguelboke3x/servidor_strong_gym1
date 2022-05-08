package com.miguelboke3x.strongGym.strongGym.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.miguelboke3x.strongGym.strongGym.entities.Productos;
import com.miguelboke3x.strongGym.strongGym.services.IProductosService;

@Controller
public class CategoriasControllers {
	@Autowired
	private IProductosService ProductosService;

	@RequestMapping(value = "/crearProductos")
	public ModelAndView crearNuevoProductos(

			@RequestParam(required = false) String nombre, 
			@RequestParam(required = false) String descripcion,
			@RequestParam(required = false) Float pvp,
			@RequestParam(required = false) String sn,
			@RequestParam(required = false) String imagen, 
			@RequestParam(required = false) Integer stock,
			@RequestParam(required = false) Boolean rebajado) {
		if (nombre != null) {

			rebajado = rebajado == null ? false : true;
			Productos e = new Productos(-1, nombre, descripcion, pvp, sn, imagen, stock, true);
			ProductosService.addProductos(e);

		}
		List<Productos> Productos = ProductosService.findAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("crear_Productos");
		mav.addObject("tipos_productos", Productos);
		return mav;
	}

	@RequestMapping(value = "/borrarProductos")
	public ModelAndView borrarPeliculas(
			@RequestParam(required = false) Integer id) {
		ProductosService.delete(id);
		return new ModelAndView("redirect:./crearProductos");
	}
}
