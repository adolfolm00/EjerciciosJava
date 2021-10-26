package ejerciciost5;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		System.out.println("***Pregunta 1: Jugador con más balones de oro***");
		System.out.println("Messi");
		System.out.println("Cristiano");
		System.out.println("Cruyff");
		String n1= sc.nextLine();
		int punt=0;
		
			if(n1.equalsIgnoreCase("Messi")) {
				System.out.println("Correcto");
				punt++;
			}
			else {
				System.out.println("Incorrecto");
			}
		
		System.out.println("***Pregunta 2: Jugador con más Champions");
		System.out.println("Cristiano");
		System.out.println("Paco Gento");
		System.out.println("Messi");
		String n2= sc.nextLine();
		
			if(n2.equalsIgnoreCase("Paco Gento")){
				System.out.println("Correcto");
				punt++;
			}
			else {
				System.out.println("Incorrecto");
			}
			
		System.out.println("***Pregunta 3: Equipo con más ligas de España");
		System.out.println("Barcelona");
		System.out.println("Atleti");
		System.out.println("Madrid");
		String n3= sc.nextLine();
		
			if(n3.equalsIgnoreCase("Madrid")) {
				System.out.println("Correcto");
				punt++;
			}
			else {
				System.out.println("Incorrecto");
			}
			
		System.out.println("***Pregunta 4: Equipo con más Copas del Rey");
		System.out.println("Atleti");
		System.out.println("Barcelona");
		System.out.println("Madrid");
		String n4= sc.nextLine();
		
			if(n4.equalsIgnoreCase("Barcelona")) {
				System.out.println("Correcto");
				punt++;
			}
			else {
				System.out.println("Incorrecto");
			}
			
		System.out.println("***Pregunta 5: ¿Qué equipos se enfrentaron en la Final de Champions de 2010?");
		System.out.println("A: Real Madrid-Juventus");
		System.out.println("B: Inter-Bayern");
		System.out.println("C: Manchester United-Milán");
		String n5= sc.nextLine();
		
			if(n5.equalsIgnoreCase("b")) {
				System.out.println("Correcto");
				punt++;
			}
			else {
				System.out.println("Incorrecto");
			}
			
		System.out.println("***Pregunta 6: ¿Cuál es la selección con mas mundiales?");
		System.out.println("Brasil");
		System.out.println("Alemania");
		System.out.println("Italia");
		String n6= sc.nextLine();
		
			if(n6.equalsIgnoreCase("Brasil")) {
				System.out.println("Correcto");
				punt++;
			}
			else {
				System.out.println("Incorrecto");
			}
			
			
		System.out.println("***Pregunta 7: ¿Cuál es el equpo más antiguo del mundo?");
		System.out.println("Flamengo");
		System.out.println("Sheffield");
		System.out.println("Bayern");
		String n7=sc.nextLine();
		
			if(n7.equalsIgnoreCase("Sheffield")) {
				System.out.println("Correcto");
				punt++;
			}
			else {
				System.out.println("Incorrecto");
			}
			
		System.out.println("***Pregunta 8: Jugador con más goles de la historia");
		System.out.println("Pele");
		System.out.println("Cristiano");
		System.out.println("Bican");
		String n8=sc.nextLine();
		
			if(n8.equalsIgnoreCase("Bican")) {
				System.out.println("Correcto");
				punt++;
			}
			else {
				System.out.println("Incorrecto");
			}
			
		System.out.println("***Pregunta 9: Jugador con más títulos de la historia");
		System.out.println("Alves");
		System.out.println("Messi");
		System.out.println("Xavi");
		String n9=sc.nextLine();
		
			if(n9.equalsIgnoreCase("Alves")) {
				System.out.println("Correcto");
				punt++;
			}
			else {
				System.out.println("Incorrecto");
			}
			
		System.out.println("***Pregunta 10: Entrenador con más títulos de la historia");
		System.out.println("Mourinho");
		System.out.println("Ferguson");
		System.out.println("Guardiola");
		String n10=sc.nextLine();
		
			if(n10.equalsIgnoreCase("Ferguson")) {
				System.out.println("Correcto");
				punt++;
			}
			else {
				System.out.println("Incorrecto");
			}
		
			
			
		System.out.println("Tu nota es "+punt);
			
			
		sc.close();
		
		
		
		
		

	}

}
