package javaNavidad;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Escriba un número");
		int n=sc.nextInt();
		if(n>0) {
			System.out.println("El número es positivo");
		}
		else if(n==0) {
			System.out.println("El número es neutro");
		}
		else {
			System.out.println("El número es negativo");
		}
		sc.close();
		

	}

}
