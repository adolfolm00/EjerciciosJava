package ClaseSerializablee;

public class Producto3 {
	
	private String nombre;
	private int codigo;
	private int stock;
	private float precio;
	
	
	
	public Producto3(String nombre, int codigo, int stock, float precio) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.stock = stock;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public int getStock() {
		return stock;
	}
	public float getPrecio() {
		return precio;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	

}
