package com.example.demo.service;


import com.example.demo.exception.ProductoInexistente;
import com.example.demo.model.Producto;
import com.example.demo.repository.ProductoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductoService {

    private final ProductoRepository productoRepository;

    public Producto createProducto(Producto producto){
        return productoRepository.save(producto);
    }

    public void deleteProducto(Long id){
        productoRepository.deleteById(id);
    }

    public Producto getProducto (Long id) throws ProductoInexistente {
       Producto producto = productoRepository.findById(id).get();
       if(producto == null){
           throw new ProductoInexistente(producto.getId());
       }
       return producto;

    }

    public List<Producto> getProductos(){
        return productoRepository.findList();
    }

    public void modifyProducto(long id, Producto producto){


            Producto prodcutoAModificar = productoRepository.findById(id).get();
        if (producto!=null) {
            prodcutoAModificar.setNombre(producto.getNombre());
            prodcutoAModificar.setPrecio(producto.getPrecio());
            prodcutoAModificar.setDescripcion(producto.getDescripcion());
        }


    }
}
