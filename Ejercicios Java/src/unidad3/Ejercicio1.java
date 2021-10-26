package unidad3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Escribe el primer número");
		int numero= teclado.nextInt();
		System.out.println("Escriba el segundo número");
		int numero2=teclado.nextInt();
		System.out.println("El resultado de la multiplicación es "+numero*numero2);
		
		teclado.close();

	}

}
