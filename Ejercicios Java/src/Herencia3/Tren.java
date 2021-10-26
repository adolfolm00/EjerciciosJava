package Herencia3;

public class Tren extends Medio {
	
	private String compañia;

	public Tren(String nombre, int pasajeros, int velocidad, String compañia) {
		super(nombre, pasajeros, velocidad);
		this.compañia = compañia;
		
		precio=90;
		
		if(velocidad>190) {
			precio=150;
		}
	}

	@Override
	public String toString() {
		return "Tren Nombre->"+getNombre()+"|"+" Pasajeros->"+getPasajeros()+"|"+" Velocidad->"+getVelocidad()+"|"+" Compañía->" +compañia+"|"+" Precio->"+precio;
	}
	
	
	
	
	
	

}
