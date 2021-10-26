package ejerciciosT4;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Escribe un número");
		float n=sc.nextFloat();
		System.out.println(Math.floor(n));
		sc.close();
	}

}
