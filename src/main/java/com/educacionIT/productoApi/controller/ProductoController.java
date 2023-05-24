package com.educacionIT.productoApi.controller;

import com.educacionIT.productoApi.model.Producto;import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producto")
public class ProductoController{

    @GetMapping("/get")
    public ResponseEntity<Producto> getProducto(){
        Producto producto = new Producto();
        return ResponseEntity.ok(producto);
    }

    @PostMapping("/post")
    public ResponseEntity<Void> addProduct(@RequestBody Producto producto){

        Producto nproducto = new Producto();
        System.out.println(nproducto.toString());

        return new ResponseEntity<>(HttpStatus.CREATED);
    }


}
