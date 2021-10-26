package javaNavidad;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Escribe tu año de nacimiento");
		int n=teclado.nextInt();
		System.out.println("Escribe el año actual");
		int n1=teclado.nextInt();
		System.out.println("Tu edad es "+(n1-n));
		teclado.close();

	}

}
