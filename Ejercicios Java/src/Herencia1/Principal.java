package Herencia1;

public class Principal {

	public static void main(String[] args) {
		
		Persona p1= new Persona("Aurelio","Martínez","Barrios",33);
		Futbolista p2= new Futbolista("Jesús","Navas","González",34,16,"Lateral derecho");
		Alumno p3= new Alumno("Antonio","Valle","Tejero",22,9879876,2);
		
		p1.Salida();
		p2.Salida();
		p3.Salida();

	}

}
