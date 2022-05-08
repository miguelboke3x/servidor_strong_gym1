package com.miguelboke3x.strongGym.strongGym.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.miguelboke3x.strongGym.strongGym.entities.Productos;
import com.miguelboke3x.strongGym.strongGym.services.IProductosService;

@Controller
public class MainControllers {
	@Autowired
	IProductosService servicioProductos;

	@RequestMapping(value = "/")
	public ModelAndView mostrarPrincipal() {
		List<Productos> productos = servicioProductos.findAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("principal");
		mav.addObject("tipos_productos", productos);
		return mav;
	}

}
