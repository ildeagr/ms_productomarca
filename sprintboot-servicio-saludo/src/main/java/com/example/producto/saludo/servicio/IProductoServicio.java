package com.example.producto.saludo.servicio;

import java.util.List;

import com.example.producto.saludo.mensaje.ProductoMarca;
import com.example.producto.saludo.mensaje.ProductoMensaje;

public interface IProductoServicio {
	
	public ProductoMensaje mensajeback();
	public List<ProductoMarca> findAll();
}
