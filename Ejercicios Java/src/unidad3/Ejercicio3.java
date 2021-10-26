package unidad3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Escribe tu año de nacimiento");
		int edad=teclado.nextInt();
		System.out.println("Escribe el año acutal");
		int ano=teclado.nextInt();
		
		if(ano-edad>=18) {
			System.out.println("Eres mayor de edad");
		}
		else {
			System.out.println("Eres menor de edad");
		}
		teclado.close();
		

	}

}