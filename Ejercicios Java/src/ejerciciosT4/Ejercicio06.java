package ejerciciosT4;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner minutos=new Scanner(System.in);
		Scanner horas=new Scanner(System.in);
		
		System.out.println("Escribe las horas");
		int hora=horas.nextInt();
		
		System.out.println("Escribe los minutos");
		int min=minutos.nextInt();
		
		int segundospasados= (hora*3600)+(min*60);
		int segundosparanoche=(24*3600)-segundospasados;
		
		System.out.println("Faltan "+segundosparanoche+" segundos hasta media noche");
		minutos.close();
		horas.close();

	}

}
