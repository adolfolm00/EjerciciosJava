package ejerciciosoop;

import java.util.Arrays;

public class Persona {

	private String nombre;
	private int edad;
	private char sexo='M';
	private double peso;
	private double altura;
	private double imc;
	private int []dni= new int[8];
	
	
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	public double calcularIMC() {
		imc=peso/(Math.pow(altura, 2));
		
		if(imc<=20) {
			return -1;
		}
		if(imc>=20 && imc<=25) {
			return 0;
		}
		else {
			return 1;
		}
	}
	
	public void esMayorDeEdad() {
		if(edad<18) {
			System.out.println("Es menor de edad");
		}
		else {
			System.out.println("Es mayor de edad");
		}
	}
	
	public  void comprobarSexo() {
		if(sexo!='M' || sexo!='H') {
			sexo='M';
		}
		else if(sexo=='H') {
			sexo='H';
		}
	}
	
	public void generaDNI() {
		for(int i=0;i<dni.length;i++) {
			dni[i]=((int)(Math.random()*9));
		}
	}

	@Override
	public String toString() {
		return "Persona Nombre: " + nombre+"\n" + "Edad: " + edad +"\n"+ "Sexo: " + sexo +"\n"+ "Peso" + peso +"\n"+ "Altura:"
				+ altura +"\n"+ "IMC: " + imc +"\t"+ "DNI: " + Arrays.toString(dni) ;
	}
	
	

	
	
	
}
