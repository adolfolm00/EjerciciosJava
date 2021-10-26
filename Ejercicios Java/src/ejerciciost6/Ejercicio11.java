package ejerciciost6;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n;
		do {
		System.out.println("Escribe un número positivo");
		n=sc.nextInt();
		}
		while(n<=0);
		
			for(int i=0;i<=100;i++) {
			System.out.println(n);
			n=n+1;
			}
		
		
		sc.close();

	}

}
