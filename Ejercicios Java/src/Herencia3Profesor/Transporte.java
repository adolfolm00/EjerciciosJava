package Herencia3Profesor;

public class Transporte {
	
	private String nombre;
	private int pasajeros;
	private int velocidad;
	private float precio;
	
	
	public Transporte(String nombre, int pasajeros, int velocidad) {
		super();
		this.nombre = nombre;
		this.pasajeros = pasajeros;
		this.velocidad = velocidad;
	}


	public String getNombre() {
		return nombre;
	}


	public int getPasajeros() {
		return pasajeros;
	}


	public int getVelocidad() {
		return velocidad;
	}


	public float getPrecio() {
		return precio;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}


	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Transporte [nombre=" + nombre + ", pasajeros=" + pasajeros + ", velocidad=" + velocidad + ", precio="
				+ precio + "]";
	}
	
	
	
	

}
