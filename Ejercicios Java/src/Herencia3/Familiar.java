package Herencia3;

public class Familiar extends Coche{
	
	private boolean isofix;

	public Familiar(String nombre, int pasajeros, int velocidad, int puertas, String color, String marca, String modelo,
			boolean isofix) {
		super(nombre, pasajeros, velocidad, puertas, color, marca, modelo);
		this.isofix = isofix;
		
		precio=80;
		
		if(isofix==true) {
			precio=85;
		}
		
		if(pasajeros>5) {
			precio=precio+((precio*20)/100);
		}
	}

	@Override
	public String toString() {
		return "Nombre->"+getNombre()+"|"+" Pasajeros->"+getPasajeros()+"|"+" Velocidad->"+getVelocidad()+"|"+" Puertas->"+getPuertas()+"|"+" Color->"+getColor()+"|"+" Marca->"+getMarca()+"|"+" Modelo->"+getModelo()+"|"+" Precio->"+precio;
	}
	
	
	
	
	
	
	

}
