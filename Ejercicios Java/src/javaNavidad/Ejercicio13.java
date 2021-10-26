package javaNavidad;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Escribe tu edad");
		int edad=teclado.nextInt();
		if(edad>=18) {
			System.out.println("Eres mayor de edad");
		}
		else {
			System.out.println("Eres menor de edad");
		}
		teclado.close();
		

	}

}
