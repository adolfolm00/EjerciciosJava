package Herencia1;

public class Alumno extends Persona {

	private int Codigo;
	private int Curso;
	
	public Alumno(String nombre, String apellido1, String apellido2, int edad, int codigo, int curso) {
		super(nombre, apellido1, apellido2, edad);
		Codigo = codigo;
		Curso = curso;
	}
	public int getCodigo() {
		return Codigo;
	}
	public int getCurso() {
		return Curso;
	}
	
	

}
