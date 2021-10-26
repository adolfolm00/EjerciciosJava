package unidad3;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Escribe las horas que trabajas diarias");
		int horas=teclado.nextInt();
		horas*=12;
		System.out.println("Su salario semanal es "+horas*7);
		teclado.close();

	}

}
