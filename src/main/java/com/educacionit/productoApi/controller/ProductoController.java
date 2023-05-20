package com.educacionit.productoApi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educacionit.productoApi.model.Producto;



@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	
	@GetMapping("/get")
	public ResponseEntity<Producto> getProducto() {
		Producto producto = new Producto(1, 33.20 , "Papa", "Verdura");
		
		return ResponseEntity.ok(producto);
		
	}

}