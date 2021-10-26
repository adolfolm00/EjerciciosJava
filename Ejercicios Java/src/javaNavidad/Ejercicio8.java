package javaNavidad;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Escribe tu nombre");
		String nombre=teclado.nextLine();
		System.out.println("Escribe tu edad");
		String edad=teclado.nextLine();
		System.out.println("Escribe tu población");
		String poblacion=teclado.nextLine();
		System.out.println("Tu nombre es "+nombre);
		System.out.println("Tu edad es "+edad);
		System.out.println("Tu población es "+poblacion);
		teclado.close();

	}

}
