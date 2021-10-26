package javaNavidad;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Escriba el primer número");
		int n=teclado.nextInt();
		System.out.println("Escriba el segundo número");
		int n2=teclado.nextInt();
		System.out.println("La suma es "+(n+n2));
		System.out.println("La resta es "+(n-n2));
		System.out.println("La multiplicación es "+(n*n2));
		System.out.println("La división es "+(n/n2));
		teclado.close();

	}

}
