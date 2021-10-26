package ejerciciosoop;

public class Pizza {
	
	private String nombre;
	private int ingextra;
	private double precioing=0.75;
	private String tamaño;
	private String reparto;
	private double precio=6;
	private int fecha;
	private int id;
	private static int idnext=1;
	
	public Pizza(String nombre, int ingextra, String tamaño, String reparto, int fecha) {
		super();
		this.nombre = nombre;
		this.ingextra = ingextra;
		this.tamaño = tamaño;
		this.reparto = reparto;
		this.fecha = fecha;
		
		id=idnext;
		idnext++;
		
		if(ingextra==0) {
			precioing=0;
		}
		else if(ingextra>=1) {
			precioing=precioing*ingextra;
		}
		
		if(tamaño.equalsIgnoreCase("Pequeña")) {
			precio=precio*1.25;
		}
		else if(tamaño.equalsIgnoreCase("Mediana")) {
			precio=precio*2.75;
		}
		else if(tamaño.equalsIgnoreCase("Grande")) {
			precio=precio*3.11;
		}
		
		if(reparto.equalsIgnoreCase("A domicilio")) {
			precio=precio+3;
		}
		
		if(fecha>1 && fecha<=5) {
			precio=precio-1.5;
		}
		else {
			precio=precio+1.20;
		}
		
		precio=precio+precioing;
		
	}

	@Override
	public String toString() {
		return "-Pizza Nombre=" + nombre + "\n-Número ingredientes extra=" + ingextra + "\n-Precio ingredientes=" + precioing + "\n-Tamaño Pizza=" + tamaño
				+ "\n-Reparto=" + reparto + "\n-Precio total=" + precio + "\n-Día de la semana=" + fecha + "\n-ID=" + id ;
	}
	
	
	
	

}
