package ejerciciosT4;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Escribe un número");
		int n=sc.nextInt();
		
		if(n%2==0 & n%5==0 || n%5==5) {
			System.out.println(n+" es par y divisor de 5");
		}
		else if(n%2==0) {
			System.out.println(n+" es par");
		}
		else if(n%5==0 || n%2==0) {
			System.out.println(n+ " es divisor de 5");
		}
		
		
		sc.close();

	}

}
