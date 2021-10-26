package poo;

public class ObjetoJugador {

	public static void main(String[] args) {
		
		Jugador cristiano= new Jugador();
		
		cristiano.setEquipo("Juventus");
		cristiano.setNombre("Cristiano Ronaldo");
		cristiano.setNumero(7);
		cristiano.setPierna("Ambas");
		cristiano.setEdad(35);
		
		System.out.println("EQUIPO: "+cristiano.getEquipo());
		System.out.println("NOMBRE: "+cristiano.getNombre());
		System.out.println("NÚMERO: "+cristiano.getNumero());
		System.out.println("PIERNA: "+cristiano.getPierna());
		System.out.println("EDAD: "+cristiano.getEdad());

	}

}
