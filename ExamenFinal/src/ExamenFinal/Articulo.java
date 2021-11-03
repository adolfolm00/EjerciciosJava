package ExamenFinal;

public class Articulo {
	
	//Atributos
	private int id;
	private static int idnext=1;
	private String nombre;
	private float precioventacliente;
	private float preciocompraproveedor;
	private float iva;
	private int stock;
	private String nombrecomprador;
	private int nventas;
	private int ncompras;
	
	//Constructor
	public Articulo(String nombre,float precioventacliente, float preciocompraproveedor, int stock) {
		super();
		this.nombre=nombre;
		this.precioventacliente = precioventacliente;
		this.preciocompraproveedor = preciocompraproveedor;
		this.stock = stock;
		
		iva=0.21f;
		
		setPrecioventacliente(precioventacliente+(precioventacliente*iva));
		setPreciocompraproveedor(preciocompraproveedor+(preciocompraproveedor*iva));
		id=idnext++;
	}

	//Getters & setters
	public int getId() {
		return id;
	}


	public float getPrecioventacliente() {
		return precioventacliente;
	}


	public float getPreciocompraproveedor() {
		return preciocompraproveedor;
	}


	public float getIva() {
		return iva;
	}


	public int getStock() {
		return stock;
	}


	public String getNombrecomprador() {
		return nombrecomprador;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setPrecioventacliente(float precioventacliente) {
		this.precioventacliente = precioventacliente;
	}


	public void setPreciocompraproveedor(float preciocompraproveedor) {
		this.preciocompraproveedor = preciocompraproveedor;
	}


	public void setIva(float iva) {
		this.iva = iva;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public void setNombrecomprador(String nombrecomprador) {
		this.nombrecomprador = nombrecomprador;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

	public int getNventas() {
		return nventas;
	}

	public int getNcompras() {
		return ncompras;
	}

	public void setNventas(int nventas) {
		this.nventas = nventas;
	}

	public void setNcompras(int ncompras) {
		this.ncompras = ncompras;
	}

	//Método si es posible vender a cliente
	public String venderCliente(int stockmain) {
		String posible="null";
		if(stockmain>stock) {
			posible="False";
		}
		else if(stockmain<=stock) {
			posible="True";
		}
		return posible;
		
	}
	//Método comprar a proveedor
	public void comprarProveedor(int stockmain) {
		stock=stock+stockmain;
		}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("\nID: ");
		sb.append(id);
		sb.append("\nNombre: ");
		sb.append(nombre);
		sb.append("\nPrecio de venta a cliente: ");
		sb.append(precioventacliente);
		sb.append("\nPrecio de compra a proveedor: ");
		sb.append(preciocompraproveedor);
		sb.append("\nIVA: ");
		sb.append(iva);
		sb.append("\nStock: ");
		sb.append(stock);
		sb.append("\nNúmero de compras: ");
		sb.append(ncompras);
		sb.append("\nNúmero de ventas: ");
		sb.append(nventas);
		
		return sb.toString();
	}
		
	



	
	
	
	
	

}
