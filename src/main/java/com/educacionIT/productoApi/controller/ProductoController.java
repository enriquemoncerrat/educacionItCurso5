package com.educacionIT.productoApi.controller;

import com.educacionIT.productoApi.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class ProductoController{

    @GetMapping("/get")
    public ResponseEntity<Producto> getProducto(){
        Producto producto = new Producto(250,"Papas", "Verdura");
        return ResponseEntity.ok(producto);
    }

}
