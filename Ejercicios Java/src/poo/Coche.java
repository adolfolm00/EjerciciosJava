package poo;

public class Coche {

	//Atributos
	public String color;
	public int puertas;
	public String marca;
	public String modelo;
	public int velocidad;
	
	
	//Métodos
	
	public String imprimir() {
		return "Marca " +marca+" MODELO: " +modelo+" COLOR "+color+" PUERTAS: "+ puertas+ "";
	}
	
	public String avanzar() {
		String texto;
		if (velocidad>150) {
			texto="MULTA";
		}
		else {
			texto="AVANZANDO";
		}
		return texto;
	
		
		
	}
	
}
