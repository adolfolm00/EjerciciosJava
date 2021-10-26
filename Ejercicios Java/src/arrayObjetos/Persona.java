package arrayObjetos;


public class Persona {
	
	//Atributos
	
	private String nombre="";
	private int edad=0;
	private int dni;
	private char sexo='M';
	private double peso=0;
	private double altura=0;
	
	//Métodos
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		
		if(sexo=='M' || sexo=='H') {
			this.sexo=sexo;
		}
		else {
			this.sexo='M';
		}
		
		dni=(int)Math.random()*99999999;
	}
	
	
	
	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	public int calcularIMC(double peso, double altura) {
		int resultado=0;
		double formula;
		formula=(peso/Math.pow(altura, 2));
		
		if (formula<20) {
			resultado=-1;
		}else if(formula>20 && formula<=25) {
			resultado=0;
		}
		else {
			resultado=1;
		}
		return resultado;
	}

	
	
	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public boolean esMayorDeEdad(int edad) {
		boolean verificacion;
		
		if (edad>=18) {
			verificacion=true;
		}
		else {
			verificacion=false;
		}
		
		return verificacion;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
