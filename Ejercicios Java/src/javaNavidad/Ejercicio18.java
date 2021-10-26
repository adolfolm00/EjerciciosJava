package javaNavidad;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Escribe una frase");
		String frase=sc.next();
		System.out.println("Escribe un número");
		int n=sc1.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println(frase);
		}
		sc.close();
		sc1.close();

	}

}
