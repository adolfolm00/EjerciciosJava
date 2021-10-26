package HerenciaNBA;


public class Entrenador extends NBA {
	
	private int porcvictorias;
	private String universidad;
	


	public Entrenador(int dia, int mes, int annio, String nombre, String apellidos, int edad, int porcvictorias,
			String universidad) {
		super(dia, mes, annio, nombre, apellidos, edad);
		this.porcvictorias = porcvictorias;
		this.universidad = universidad;
	}


	public int getPorcvictorias() {
		return porcvictorias;
	}


	public String getUniversidad() {
		return universidad;
	}
	
	
	
	

}
