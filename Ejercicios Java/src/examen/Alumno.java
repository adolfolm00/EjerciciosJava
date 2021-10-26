package examen;

public class Alumno {

	//atributos
	private String nombre;
	private int nota1trim;
	private int nota2trim;
	private int nota3trim;
	private int media1trim=0;
	private int media2trim=0;
	private int media3trim=0;
	private double notafinal;

	//constructor en el que incluyo el nombre y las notas
	public Alumno(String nombre, int nota1trim, int nota2trim, int nota3trim) {
		super();
		this.nombre = nombre;
		this.nota1trim = nota1trim;
		this.nota2trim = nota2trim;
		this.nota3trim = nota3trim;
		
		
		
		//hago las medias de cada trimestre
		for(int i=0;i<22;i++) {
			media2trim=media2trim+nota2trim;
		}
		media2trim=(media2trim/22);
		
		for(int i=0;i<22;i++) {
			media3trim=media3trim+nota3trim;
		}
		media3trim=(media3trim/22);
		
		notafinal=(nota1trim+nota2trim+nota3trim)/3;
		
		
		
	}

	



	



//getters y setters

	public int getMedia1trim() {
		return media1trim;
	}











	public void setMedia1trim(int media1trim) {
		this.media1trim = media1trim;
	}











	public int getMedia2trim() {
		return media2trim;
	}











	public void setMedia2trim(int media2trim) {
		this.media2trim = media2trim;
	}











	public int getMedia3trim() {
		return media3trim;
	}











	public void setMedia3trim(int media3trim) {
		this.media3trim = media3trim;
	}










//sacamos por pantalla todos los datos de los alumnos
	@Override
	public String toString() {
		return "Alumno Nombre: " + nombre + "\tNota 1 trimestre: " + nota1trim + "\tNota 2 trimestre: " + nota2trim + "\tNota 3 trimestre: "
				+ nota3trim + "\tNota final: "+notafinal;
	}
	
	
	
	
	
	
}
