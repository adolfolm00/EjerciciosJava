package ejerciciosoop2;

public class Libro {

	private String titulo;
	private String autor;
	private int id;
	private static int idnext=1;
	private int cantidad;
	private int numejemprestados;
	private static int contnumejemprestados=0;
	
	public Libro() {
		super();
	}

	public Libro(String titulo, String autor, int cantidad) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.cantidad= cantidad;
		
		id=idnext;
		idnext++;
		
		
		numejemprestados=contnumejemprestados;
	}
	
	public boolean Prestamo() {
		if(cantidad>0) {
			System.out.println("Compra realizada con éxito");
		numejemprestados=++contnumejemprestados;
		cantidad=--cantidad;
		return true;
		}
		else{
			System.out.println("Error, no quedan libros");
		return false;
		}
	}
		
		
	public boolean Devolucion() {
		if(contnumejemprestados>0) {
			System.out.println("Préstamo realizado con éxito");
			numejemprestados=--contnumejemprestados;
			cantidad=cantidad++;
			return true;
		}
		else {
			System.out.println("Error, no hay libros prestados");
			return false;
		}
	}

	public String menulibros() {
		return "ID: "+id+" Título: "+titulo;
	}
	
	public String disponibilidad() {
		return "Cantidad de libros restantes: Título: "+titulo+" Cantidad: "+cantidad;
	}
	
	
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", id=" + id + "]";
	}
	
	
	
	
	
	
	
	
	
}
