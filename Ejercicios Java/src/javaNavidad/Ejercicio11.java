package javaNavidad;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		double y;
		System.out.println("Introduzca el valor de a");
		double a=teclado.nextDouble();
		System.out.println("Introduzca el valor de b");
		double b=teclado.nextDouble();
		System.out.println("Introduzca el valor de c");
		double c=teclado.nextDouble();
		System.out.println("Introduzca el valor de d");
		double d=teclado.nextDouble();
		y=a+(b*c)+0.5-Math.pow((d*c),(2));
		System.out.println("Y vale "+y);
		teclado.close();

	}

}
