package Herencia3;

public class Coche extends Medio{
	
	private int puertas;
	private String color;
	protected String marca;
	private String modelo;
	
	
	public Coche(String nombre, int pasajeros, int velocidad, int puertas, String color, String marca, String modelo) {
		super(nombre, pasajeros, velocidad);
		this.puertas = puertas;
		this.color= color;
		this.marca = marca;
		this.modelo = modelo;
		
		
	}


	public int getPuertas() {
		return puertas;
	}


	public String getColor() {
		return color;
	}


	public String getMarca() {
		return marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	@Override
	public String toString() {
		return "Coche [puertas=" + puertas + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	
	
	

	
	
	
	

}
