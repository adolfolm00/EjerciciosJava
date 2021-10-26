package examen;

public class Movil {
	
	//atributos
	private String marca;
	private String modelo;
	private double pulgadas;
	private int bateria;
	private int megapixeles;
	private int peso;
	private double precio;
	
	//constructor vacio
	public Movil() {
		super();
	}

	//constructor que recogerá todos los datos de cada móvil
	public Movil(String marca, String modelo, double pulgadas, int bateria, int megapixeles, int peso) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.pulgadas = pulgadas;
		this.bateria = bateria;
		this.megapixeles = megapixeles;
		this.peso = peso;
		
		//hacemos los if de cada atributo
		if(marca.equalsIgnoreCase("Motorola")&& modelo.equalsIgnoreCase("motog8")) {
			precio=164;
		}
		else if(marca.equalsIgnoreCase("Motorola")&& modelo.equalsIgnoreCase("motog7")) {
			precio=149;
		}
		else if(marca.equalsIgnoreCase("Apple")&& modelo.equalsIgnoreCase("12")) {
			precio=699;
		}
		else if(marca.equalsIgnoreCase("Samsung")&& modelo.equalsIgnoreCase("S20")) {
			precio=572;
		}
		else {
			precio=144;
		}
		
		if(pulgadas>6.2) {
			precio=precio+28;
		}
		
		if(bateria>4000) {
			precio=precio+((precio/100)*12);
		}
		
		if(megapixeles>=10 && megapixeles<=15) {
			precio=precio+((precio/100)*8);
		}
		else if(megapixeles>15) {
			precio=precio+((precio/100)*11);
		}
	}

	//mostramos por pantalla los datos de todos los móviles
	@Override
	public String toString() {
		return "Movil"+"\n"  +"Marca: " + marca+"\n" + "Modelo: " + modelo + "\n"+"Pulgadas: " + pulgadas + "\n"+ "Bateria: " + bateria+"\n"
				+ "Megapixeles: " + megapixeles +"\n"+"Peso: " + peso + "\n"+"Precio: " + precio+"\n";
	}
	
	
	
	
	
	
	

}
