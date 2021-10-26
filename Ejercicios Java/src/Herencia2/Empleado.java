package Herencia2;

public class Empleado {
	
	private String nombre;
	private int edad;
	protected int salario;
	protected int plus=300;
	
	
	public Empleado(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public int getEdad() {
		return edad;
	}


	public int getSalario() {
		
		return salario;
	}
	
	


	public int getPlus() {
		return plus;
	}

	

	public void setEdad(int edad) {
		this.edad = edad;
	}


	public void setSalario(int salario) {
		this.salario = salario;
	}


	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", salario=" + salario+"]";
	}
	
	
	
	



}
