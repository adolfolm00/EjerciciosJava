package lfp;

public class Jugador {
	//atributos
	private String equipo;
	private String demarcacion;
	private int altura;
	private int peso;
	private String nombre;
	private int dorsal;
	private double sueldo=1000000;
	
	
	
	
	//métodos
	
	
	//constructor
	public Jugador(String equipo, String demarcacion, int altura, int peso, String nombre, int dorsal) {
		super();
		this.equipo = equipo;
		this.demarcacion = demarcacion;
		this.altura = altura;
		this.peso = peso;
		this.nombre = nombre;
		this.dorsal = dorsal;
		
		if(equipo.equalsIgnoreCase("Atlético de Madrid")|| equipo.equalsIgnoreCase("Real Madrid")|| equipo.equalsIgnoreCase("Barcelona")|| equipo.equalsIgnoreCase("Sevilla FC")) {
			sueldo=sueldo*4;
		}
		else if(equipo.equalsIgnoreCase("Villarreal")||equipo.equalsIgnoreCase("Real Sociedad")) {
			sueldo=sueldo*2.5;
		}
		else if(equipo.equalsIgnoreCase("Betis")||equipo.equalsIgnoreCase("Granada")||equipo.equalsIgnoreCase("Athletic")||equipo.equalsIgnoreCase("Celta")) {
			sueldo=sueldo*1.5;
			
		}
		
		if(demarcacion.equalsIgnoreCase("delantero")){
			sueldo=sueldo*2.4;
		}
		else if(equipo.equalsIgnoreCase("centrocampista")) {
			sueldo=sueldo*1.8;
		}
		else if(equipo.equalsIgnoreCase("portero")||equipo.equalsIgnoreCase("Granada")||equipo.equalsIgnoreCase("Athletic")||equipo.equalsIgnoreCase("Celta")) {
			sueldo=sueldo*1;
			
		}
	}


	

	@Override
	public String toString() {
		return "Jugador [equipo=" + equipo + ", demarcacion=" + demarcacion + ", altura=" + altura + ", peso=" + peso
				+ ", nombre=" + nombre + ", dorsal=" + dorsal + ", sueldo=" + sueldo + "]";
	}
	
	
	
}
