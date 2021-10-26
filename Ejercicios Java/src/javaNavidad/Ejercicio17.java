package javaNavidad;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe el primer número");
		int n1=sc.nextInt();
		System.out.println("Escribe el segundo número");
		int n2=sc.nextInt();
		System.out.println("Escribe el tercer número");
		int n3=sc.nextInt();
		if(n1*n2==n3) {
			System.out.println(n1+" y "+n2+" es igual a "+n3);
		}
		else {
			System.out.println(n1+ " y "+n2+" no es igual a "+n3);
		}
		sc.close();

	}

}
