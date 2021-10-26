package javaNavidad;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Escribe un número y se hará el cuadrado");
		int n=teclado.nextInt();
		System.out.println("El cuadrado es "+Math.pow(n, 3));
		teclado.close();

}

}
