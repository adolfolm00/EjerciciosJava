package javaNavidad;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Escriba un número");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("El número es par");
		}
		else {
			System.out.println("El número es impar");
		}
		
		sc.close();
		

	}

}
