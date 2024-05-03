package com.example.producto.saludo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.producto.saludo.mensaje.ProductoMarca;
import com.example.producto.saludo.mensaje.ProductoMensaje;
import com.example.producto.saludo.servicio.IProductoServicio;

@RestController
public class SaludoController {

	@Autowired
	private IProductoServicio productoService;
	
	@GetMapping("/saludos")
	public ProductoMensaje mostrarmensaje() {
		return productoService.mensajeback();
	  }
	
	@GetMapping("/listar")
	public List<ProductoMarca> listar(){
		return productoService.findAll();
	}

	@GetMapping("/{nombre}")
	public List<ProductoMarca> seleccion(@PathVariable String nombre){
		return productoService.findByNombre(nombre);
	}
}