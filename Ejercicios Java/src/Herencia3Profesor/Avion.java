package Herencia3Profesor;

public class Avion extends Transporte {
	
	private String modelo;

	public Avion(String nombre, int pasajeros, int velocidad, String modelo) {
		super(nombre, pasajeros, velocidad);
		this.modelo = modelo;
		
		
		float precio=180;
		
		if(modelo.equalsIgnoreCase("A300")) {
			precio=200;
			
		}
		setPrecio(precio);
	}
	

	@Override
	public String toString() {
		return getClass()+" [nombre=" + getNombre() + ", pasajeros=" + getPasajeros() + ", velocidad=" + getVelocidad() + ", precio="
				+ getPrecio() + "modelo: "+modelo;
	}

	
	
	

	
	
	

}
