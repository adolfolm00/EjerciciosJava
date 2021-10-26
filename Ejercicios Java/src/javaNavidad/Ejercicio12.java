package javaNavidad;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Escribe la resistencia del material");
		int n=teclado.nextInt();
		if(n>92) {
			System.out.println("El material es apto");
		}
		else {
			System.out.println("El material no es apto");
		}
		teclado.close();
		

	}

}
