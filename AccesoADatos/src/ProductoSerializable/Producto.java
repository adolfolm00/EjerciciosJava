package ProductoSerializable;

import java.io.Serializable;

public class Producto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id=0;
	static int idnext=1;
	String descripcion;
	int stockactual;
	int stockminimo;
	float precio;
	
	
	
	
	public Producto(String descripcion, int stockactual, int stockminimo, float precio) {
		super();
		this.descripcion = descripcion;
		this.stockactual = stockactual;
		this.stockminimo = stockminimo;
		this.precio = precio;
		
		id=idnext++;
	}
	
	
	public int getId() {
		return id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public int getStockactual() {
		return stockactual;
	}
	public int getStockminimo() {
		return stockminimo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setStockactual(int stockactual) {
		this.stockactual = stockactual;
	}
	public void setStockminimo(int stockminimo) {
		this.stockminimo = stockminimo;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Producto [id=" + id + ", descripcion=" + descripcion + ", stockactual=" + stockactual + ", stockminimo="
				+ stockminimo + ", precio=" + precio + "]";
	}
	
	
	
	

}
