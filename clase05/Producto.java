package clase05;

import java.util.Date;

public class Producto {
	private Date alta;
	private String nombre;
	private int precio;
	public Producto(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.alta = new Date();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public Date getAlta() {
		return this.alta;
	}
	
	
}
