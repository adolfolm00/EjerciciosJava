package javaNavidad;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Escribe el primer número");
		int a=teclado.nextInt();
		System.out.println("Escribe el segundo número");
		int b=teclado.nextInt();
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("El primer número vale "+a);
		System.out.println("El segundo número vale "+b);
		teclado.close();

	}

}