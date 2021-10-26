package poo;

public class ObjetoPelicula {

	public static void main(String[] args) {
		
		Pelicula pelicula1= new Pelicula();
		Pelicula pelicula2= new Pelicula();
		Pelicula pelicula3= new Pelicula();
		Pelicula pelicula4= new Pelicula();
		
		
		pelicula1.setTitulo("300");
		pelicula1.setFecha(2007);
		pelicula1.setGenero("Bélico");
		pelicula1.setActor("Gerard Butler");
		pelicula1.setLibro("No");
		pelicula1.setPrecio();
		
		pelicula2.setTitulo("Shutter Island");
		pelicula2.setFecha(2010);
		pelicula2.setGenero("Suspenso");
		pelicula2.setActor("Leonardo DiCaprio");
		pelicula2.setLibro("Sí");
		pelicula2.setPrecio();
		
		pelicula3.setTitulo("El Padrino");
		pelicula3.setFecha(1972);
		pelicula3.setGenero("Mafia");
		pelicula3.setActor("Marlon Brando");
		pelicula3.setLibro("Sí");
		pelicula3.setPrecio();
		
		pelicula4.setTitulo("Scarface");
		pelicula4.setFecha(1984);
		pelicula4.setGenero("Mafia");
		pelicula4.setActor("Al Pacino");
		pelicula4.setLibro("No");
		pelicula4.setPrecio();
		
		System.out.println(pelicula1.toString());
		System.out.println(pelicula2.toString());
		System.out.println(pelicula3.toString());
		System.out.println(pelicula4.toString());
		
		
		
		
		
		
	
		
		

	}

}
