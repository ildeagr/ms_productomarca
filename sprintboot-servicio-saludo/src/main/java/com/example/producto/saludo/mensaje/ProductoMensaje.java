package com.example.producto.saludo.mensaje;

import java.io.Serializable;

public class ProductoMensaje implements Serializable{

	private String mensaje;
	
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	private static final long serialVersionUID = -6387700685089305723L;
	
}
