package com.example.producto.saludo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.example.producto.saludo.mensaje.ProductoMarca;

public interface ProductoDao extends CrudRepository<ProductoMarca, Long>{

	public List<ProductoMarca> findByNombre(String nombre);
}