package javaNavidad;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe el primer número");
		int n1=sc.nextInt();
		System.out.println("Escribe el segundo número");
		int n2=sc.nextInt();
		System.out.println("Escribe el tercer número");
		int n3=sc.nextInt();
		if(n1>n2) {
			if(n1>n3) {
				System.out.println("El mayor es "+n1);
			}
			else {
				System.out.println("El mayor es "+n3);
			}
		}
		else if(n2>n3) {
			System.out.println("El mayor es "+n2);
		}
		else {
			System.out.println("El mayor es "+n3);
		}
		
		sc.close();
	}

}
