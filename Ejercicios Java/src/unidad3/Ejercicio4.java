package unidad3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Escribe el primer número");
		int n1=teclado.nextInt();
		System.out.println("Escriba el segundo número");
		int n2=teclado.nextInt();
		System.out.println("La suma es "+(n1+n2));
		System.out.println("La resta es "+(n1-n2));
		System.out.println("La multiplicación es "+(n1*n2));
		System.out.println("La división es "+(n1/n2));
		teclado.close();

	}

}
