package ejerciciosoop;

public class ClaseMontadito01 {

	private String nombre;
	private int numero;
	private int montaditos;
	private String consumicion;
	private int precio=2;
	public ClaseMontadito01(String nombre, int numero, int montaditos, String consumicion) {
		super();
		this.nombre = nombre;
		this.numero = numero;
		this.montaditos = montaditos;
		this.consumicion = consumicion;
		precio=precio*montaditos;
		if(consumicion.equalsIgnoreCase("mesa")) {
			precio=precio+3;
		}
		
		
	}
	@Override
	public String toString() {
		return "ClaseMontadito01 [nombre=" + nombre + ", numero=" + numero + ", montaditos=" + montaditos
				+ ", consumicion=" + consumicion + ", precio=" + precio + "]";
	}
	
	
	
	
	
	
}
