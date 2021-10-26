package ejerciciost6;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Escribe un número");
		int n=sc.nextInt();
		
			if(n%n==0 & n%1==0) {
				System.out.println(n+" es primo");
			}
			else {
				System.out.println(n+" no es primo");
			}
				
		
		
		sc.close();

	}

}
