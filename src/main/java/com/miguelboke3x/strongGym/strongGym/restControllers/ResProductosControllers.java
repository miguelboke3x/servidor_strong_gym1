package com.miguelboke3x.strongGym.strongGym.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miguelboke3x.strongGym.strongGym.entities.Productos;
import com.miguelboke3x.strongGym.strongGym.services.IProductosService;




@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ResProductosControllers {
	@Autowired
	IProductosService ips;
	
	
		
		@GetMapping(path="/productos", produces= {MediaType.APPLICATION_JSON_VALUE})
		List<Productos> getProductos(){
			System.err.println("******************************** PRODUCTOS****");
			return ips.findAll();
		}

}
