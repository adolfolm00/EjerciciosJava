package javaNavidad;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		int x=0;
		do {
			System.out.println("Escribe un número");
			n=sc.nextInt();
			x++;
		}
		while(n!=0);
		System.out.println("Has introducido "+(x-1)+" números");
		
		
		sc.close();

	}

}
