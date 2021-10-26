package Herencia3Profesor;

public class Tren extends Transporte {
	
	private String compania;

	public Tren(String nombre, int pasajeros, int velocidad, String compania) {
		super(nombre, pasajeros, velocidad);
		this.compania = compania;
		
		float precio=90;
		
		if(getVelocidad()>190) {
			precio=150;
		}
		
		setPrecio(precio);
	}
	
	

	public String getCompania() {
		return compania;
	}



	public void setCompania(String compania) {
		this.compania = compania;
	}



	@Override
	public String toString() {
		return  getClass()+" [nombre=" + getNombre() + ", pasajeros=" + getPasajeros() + ", velocidad=" + getVelocidad() + ", precio="
				+getPrecio() + " Compañía:"+compania;
	}

	
	
	
	

}
