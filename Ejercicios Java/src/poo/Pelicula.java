package poo;

public class Pelicula {

	private String titulo;
	private int fecha;
	private String actor;
	private String libro;
	private String genero;
	private int precio;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getFecha() {
		return fecha;
	}
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getLibro() {
		return libro;
	}
	public void setLibro(String libro) {
		this.libro = libro;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void setPrecio() {
		double cantidad=5;
		
		if(genero.equalsIgnoreCase("Acción")) {
			cantidad=((cantidad*10)/100)+cantidad;
		}
		if(fecha>2000) {
			cantidad=cantidad+1.25;
		}
		precio=(int) cantidad;
	}
	public String toString() {
		return "Película: "+titulo+"\n"+" Fecha: "+fecha+"\n"+" Actor principal: "+actor+"\n"+" ¿Tiene libro?: "+libro+"\n"+" Género: "+genero+"\n"+" Precio: "+precio;
	}
	
	
	
	
	
}
