package Herencia3;

public class Avion extends Medio{
	
	private String modelo;
	


	public Avion(String nombre, int pasajeros, int velocidad, String modelo) {
		super(nombre, pasajeros, velocidad);
		this.modelo = modelo;
		
		
		
		int cont=300;
		
		while(cont<=390) {
			if(modelo.equals("A"+cont)) {
				precio=200;
			}
			else if(modelo.equalsIgnoreCase("737")) {
				precio=0;
			}
			else {
				precio=180;
			}
			cont++;
		}
		

	}


	@Override
	public String toString() {
		return "Avion Nombre->" + getNombre() +"|"+" Pasajeros->"+getPasajeros()+"|"+" Velocidad->"+getVelocidad()+"|"+" Modelo->"+modelo+"|"+" Precio->"+precio;
	}

	

	
	
	
	
	
	
	
	

}
