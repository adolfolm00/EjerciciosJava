package arrayObjetos;

public class Libro {
	
	private String autor;
	private String titulo;
	private String isbn;
	private int numpag;
	private String seccion="Clásicos";
	private int id;
	private static int idnext=1;
	
	public Libro(String autor, String titulo, String isbn, int numpag) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.isbn = isbn;
		this.numpag = numpag;
		id=idnext;
		idnext++;
	}

	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", titulo=" + titulo + ", isbn=" + isbn + ", numpag=" + numpag + ", seccion="
				+ seccion + ", id=" + id + "]";
	}
	
	
	
	
	

}
