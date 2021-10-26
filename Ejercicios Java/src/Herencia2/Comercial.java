package Herencia2;

public class Comercial extends Empleado {
	
	public int ventas;

	public Comercial(String nombre, int edad, int ventas) {
		super(nombre, edad);
		this.ventas = ventas;
		
		salario=ventas*40;
		
		if (edad>40 && ventas>4) {
			salario=salario+plus;
			
		}
		
	
	}

	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}
	
	}
	

	
	
	



