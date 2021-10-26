package poo;

public class Animal {
	
	public String clasificacion;
	public String alimentacion;
	public int patas;
	public String color;
	
	public String imprimir() {
		return "Clasificación: "+clasificacion+" Alimentación: "+alimentacion+" Patas: "+patas+" Color: "+color;
	}

	public String ladrido() {
		return "GUAU";
		
	}
}
