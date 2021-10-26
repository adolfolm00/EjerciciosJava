package javaNavidad;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe el peso del objeto 1");
		int peso1=sc.nextInt();
		System.out.println("Escribe el peso del objeto 2");
		int peso2=sc.nextInt();
		if(peso1==peso2/4) {
			System.out.println("Los objetos cumplen con la especificación");
		}
		else {
			System.out.println("Los objetos no cumplen con la especificación");
		}
		sc.close();

	}

}
