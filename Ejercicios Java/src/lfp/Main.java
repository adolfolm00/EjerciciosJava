package lfp;

public class Main {

	public static void main(String[] args) {
		
		Jugador j1=new Jugador("Sevilla FC","delantero",190,79,"Lucas Ocampos",5);
		Jugador j2= new Jugador("Elche","delantero",180,90,"Nino",9);
		Jugador j3= new Jugador("Celta","delantero",190,82,"Aspas",10);
		Jugador j4= new Jugador("Barcelona","delantero",160,60,"Messi",10);
		Jugador j5= new Jugador("Real Madrid","defensa",190,85,"Ramos",4);
		Jugador j6=new Jugador("Villarreal","porero",188,83,"Asenjo",1);
		Jugador j7= new Jugador("Sevilla FC","defensa",180,90,"Kounde",3);
		Jugador j8= new Jugador("Real Madrid","delantero",190,85,"Mariano",7);
		
		System.out.println(j1.toString());
		System.out.println(j2.toString());
		System.out.println(j3.toString());
		System.out.println(j4.toString());
		System.out.println(j5.toString());
		System.out.println(j6.toString());
		System.out.println(j7.toString());
		System.out.println(j8.toString());

	}

}
