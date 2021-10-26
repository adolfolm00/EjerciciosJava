package Herencia2;

public class Repartidor extends Empleado {
	
	public int entregas;
	public int zona;


	public Repartidor(String nombre, int edad, int entregas, int zona) {
		super(nombre, edad);
		this.entregas = entregas;
		this.zona = zona;
		
		
		salario=entregas*12;
		
		if(edad>30 && (zona==2 || zona==3) && entregas>5) {
			salario=salario+plus;
		}
	}


	public int getEntregas() {
		return entregas;
	}


	public int getZona() {
		return zona;
	}


	public void setEntregas(int entregas) {
		this.entregas = entregas;
	}


	public void setZona(int zona) {
		this.zona = zona;
	}
	
	
	
	
	
	

}
