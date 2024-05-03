package com.example.producto.saludo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.producto.saludo.dao.ProductoDao;
import com.example.producto.saludo.mensaje.ProductoMarca;
import com.example.producto.saludo.mensaje.ProductoMensaje;



@Service
public class ProductoServicioImpl implements IProductoServicio{

	@Autowired
	private ProductoDao productodao;
	
	@Override
	public ProductoMensaje mensajeback() {
		ProductoMensaje mensaje=new ProductoMensaje();
		mensaje.setMensaje("Hola Novio, gracias por tu ayuda. Te quiero");
		
		return mensaje;
	}

	@Override
	@Transactional(readOnly = true) 
	public List<ProductoMarca> findAll() {
		return (List<ProductoMarca>) productodao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public List<ProductoMarca> findByNombre(String nombre) {
		return (List<ProductoMarca>) productodao.findByNombre(nombre);
	}

}
