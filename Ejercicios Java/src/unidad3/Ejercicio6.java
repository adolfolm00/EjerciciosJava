package unidad3;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Escriba un número real y se calculará su cubo");
		int n=teclado.nextInt();
		System.out.println("El cubo de "+n+" es "+ Math.pow(n, 3));
		teclado.close();

	}

}
