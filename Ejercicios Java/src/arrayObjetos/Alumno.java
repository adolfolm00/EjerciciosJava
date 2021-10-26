package arrayObjetos;

public class Alumno {
	
	private String nombre;
	private int curso;
	private int edad;
	
	
	public Alumno(String nombre, int curso, int edad) {
		this.nombre = nombre;
		this.curso = curso;
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCurso() {
		return curso;
	}


	public void setCurso(int curso) {
		this.curso = curso;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Alumno-> nombre=" + nombre + ", curso=" + curso + ", edad=" + edad + " ";
	}
	
	

}
