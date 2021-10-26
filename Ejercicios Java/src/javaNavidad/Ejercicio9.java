package javaNavidad;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner numero= new Scanner(System.in);
		Scanner caracter= new Scanner(System.in);
		Scanner cadena= new Scanner(System.in);
		System.out.println("Introduce un número");
		int num=numero.nextInt();
		System.out.println("Has introducido el número "+num);
		System.out.println("Introduce un carácter");
		char letra=caracter.next().charAt(0);
		System.out.println("Has introducido el carácter "+letra);
		System.out.println("Introduzca una cadena");
		String palabra=cadena.nextLine();
		System.out.println("Has introducido la palabra "+palabra);
		numero.close();
		caracter.close();
		cadena.close();
		
		

	}

}
