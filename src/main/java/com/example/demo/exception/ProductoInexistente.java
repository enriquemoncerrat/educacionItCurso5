package com.example.demo.exception;

public class ProductoInexistente extends Exception{

    public ProductoInexistente (long id){
        super("El producto con id" + id + ", no existe");
    }
}
