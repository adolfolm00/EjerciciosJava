package HerenciaNBA;


public class Jugador extends NBA {
	
	private String posicion;
	private int mediapuntos;
	
	
	public Jugador(int dia, int mes, int annio, String nombre, String apellidos, int edad, String posicion,
			int mediapuntos) {
		super(dia, mes, annio, nombre, apellidos, edad);
		this.posicion = posicion;
		this.mediapuntos = mediapuntos;
	}

	public String getPosicion() {
		return posicion;
	}

	public int getMediapuntos() {
		return mediapuntos;
	}
	
	
	
	

}
