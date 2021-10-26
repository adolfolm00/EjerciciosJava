package javaNavidad;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe el número 1");
		int n1=sc.nextInt();
		System.out.println("Escribe el número 2");
		int n2=sc.nextInt();
		while(n1<n2-1) {
			n1++;
			System.out.println(n1);
			
			
		}
		
			
		sc.close();

	}

}
