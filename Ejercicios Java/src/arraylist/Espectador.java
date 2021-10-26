package arraylist;

public class Espectador {

	private String nombre;
	private int edad;
	private double precio;

	
	public Espectador(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		
		if(edad>=1 && edad<=8) {
			precio=4.20;
		}
		else if(edad>=9 && edad<=15) {
			precio=6.55;
		}
		else if(edad>=16 && edad<=30) {
			precio=7.10;
		}
		else if(edad>=31){
			precio=6.95;
		}
		
	}

	@Override
	public String toString() {
		return "Espectador Nombre=" + nombre + ", edad=" + edad + ", precio=" + precio + "]";
	}
	
	
	
	
	
	
	
	
}
