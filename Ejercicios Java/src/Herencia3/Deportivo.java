package Herencia3;

public class Deportivo extends Coche{
	
	public int caballos;

	public Deportivo(String nombre, int pasajeros, int velocidad, int puertas, String color, String marca,
			String modelo, int caballos) {
		super(nombre, pasajeros, velocidad, puertas, color, marca, modelo);
		this.caballos = caballos;
		
		if (marca.equalsIgnoreCase("Mercedes")||marca.equalsIgnoreCase("BMW")||marca.equalsIgnoreCase("Mercedes")) {
			precio=70;
			
			if(velocidad/2>120) {
				precio=90;
			}
			
		}
		
		
		
		
	}

	@Override
	public String toString() {
		return "Nombre->"+getNombre()+"|"+" Pasajeros->"+getPasajeros()+"|"+" Velocidad->"+getVelocidad()+"|"+" Puertas->"+getPuertas()+"|"+" Color->"+getColor()+"|"+" Marca->"+getMarca()+"|"+" Modelo->"+getModelo()+" Caballos->"+caballos+"|"+" Precio->"+precio;
	}
	
	

}
