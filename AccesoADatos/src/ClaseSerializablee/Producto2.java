package ClaseSerializablee;

import java.io.Serializable;

public class Producto2 implements Serializable {
	
	private String nombre;
	private int codigo;
	private int id;
	private int stock;
	private float precio;
	
	
	
	
	
	public Producto2(String nombre, int codigo, int id, int stock, float precio) {
		super();
		this.nombre = nombre;
		
		this.id = id;
		this.stock = stock;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public int getId() {
		return id;
	}
	public int getStock() {
		return stock;
	}
	public float getPrecio() {
		return precio;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Producto2 [nombre=" + nombre + ", codigo=" + codigo + ", id=" + id + ", stock=" + stock + ", precio="
				+ precio + "]";
	}
	
	
	
	

}
