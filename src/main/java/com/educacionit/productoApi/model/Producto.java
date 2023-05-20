package com.educacionit.productoApi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(schema="curso5",name="producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private double precio;
	@Column(name="nombre_producto",length=50)
	private String nombre;
	private String descripcion;
	
	
	public Producto(long id, double precio, String nombre, String descripcion) {
		super();
		this.id = id;
		this.precio = precio;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}


	public long getId() {
		return id;
	}


	public double getPrecio() {
		return precio;
	}


	public String getNombre() {
		return nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}
	
	
	
	
	
	
	
	
	
	

}
