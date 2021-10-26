package javaNavidad;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Escribe una distancia en km y se transformará a metros");
		int km=teclado.nextInt();
		System.out.println(km+" KM son "+(km*1000)+" metros");
		teclado.close();

	}

}