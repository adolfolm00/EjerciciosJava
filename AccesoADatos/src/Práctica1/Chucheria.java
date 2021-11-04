package Práctica1;

public class Chucheria {

	private int id;
	private static int idnext=1;
	private int estanteria;
	private String tipochucheria;
	private float preciosiniva;
	
	
	public Chucheria(int estanteria, String tipochucheria, float preciosiniva) {
		super();
		this.estanteria = estanteria;
		this.tipochucheria = tipochucheria;
		this.preciosiniva = preciosiniva;
		
		id=idnext++;
	}

	public int getId() {
		return id;
	}

	public static int getIdnext() {
		return idnext;
	}

	public int getEstanteria() {
		return estanteria;
	}

	public String getTipochucheria() {
		return tipochucheria;
	}

	public float getPreciosiniva() {
		return preciosiniva;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void setIdnext(int idnext) {
		Chucheria.idnext = idnext;
	}

	public void setEstanteria(int estanteria) {
		this.estanteria = estanteria;
	}

	public void setTipochucheria(String tipochucheria) {
		this.tipochucheria = tipochucheria;
	}

	public void setPreciosiniva(float preciosiniva) {
		this.preciosiniva = preciosiniva;
	}

	@Override
	public String toString() {
		return "Chucheria [id=" + id + ", estanteria=" + estanteria + ", tipochucheria=" + tipochucheria
				+ ", preciosiniva=" + preciosiniva + "]";
	}
	
	
	
	
	
	
	
	
}
