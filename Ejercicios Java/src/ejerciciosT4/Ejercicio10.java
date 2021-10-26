package ejerciciosT4;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Escribe un número");
		double n=sc.nextDouble();
		System.out.println(Math.round(n));
		sc.close();

	}

}
