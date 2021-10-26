package ejerciciost5;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Scanner horario= new Scanner(System.in);
		System.out.println("Introduce un día de Lunes a Viernes");
		String dia=sc.nextLine();
		int ndia=0;
		
		if(dia.equalsIgnoreCase("Lunes")) {
			ndia=0;
		}
		else if(dia.equalsIgnoreCase("Martes")) {
			ndia=1;
		}
		else if(dia.equalsIgnoreCase("Miercoles")) {
			ndia=2;
		}
		else if(dia.equalsIgnoreCase("Jueves")) {
			ndia=3;
		}
		else if(dia.equalsIgnoreCase("Viernes")) {
			ndia=4;
		}
		
		
		System.out.println("Introduce la hora");
		int hora=horario.nextInt();
		System.out.println("Introduce los minutos");
		int minutos=horario.nextInt();
		
		int totalminutos=(4*24*60)+(15*60);
		int actualminutos=(ndia*24*60)+(hora*60)+minutos;
		
		System.out.println("Faltan "+(totalminutos-actualminutos)+" minutos para llegar al fin de semana");
		sc.close();
		horario.close();


	}

}
