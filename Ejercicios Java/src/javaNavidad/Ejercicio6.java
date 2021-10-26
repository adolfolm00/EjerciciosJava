package javaNavidad;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Escribe una cantidad en pesetas y se pasarán a euros");
		int n=teclado.nextInt();
		System.out.println(n+" pesetas son "+(n/166.386)+" euros");
		teclado.close();

	}

}
