package ejerciciost6;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Escribe un número y se calcularán sus dígitos");
		int n=sc.nextInt();
		String x= Integer.toString(n);
		System.out.println(n+" tiene "+x.length()+ " dígitos");
		
		sc.close();

	}

}
