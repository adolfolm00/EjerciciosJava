package javaNavidad;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe los números aleatorios que quieres generar");
		int n=sc.nextInt();
		
		
		for(int i=0;i<n;i++) {
			int random= (int) (Math.random()*101);
			System.out.println(random);
		}
		sc.close();
		

	}

}
