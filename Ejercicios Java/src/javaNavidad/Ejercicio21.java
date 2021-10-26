package javaNavidad;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe un número");
		int n=sc.nextInt();
		int x;
		for(int i=0;i<=100;i++) {
			x=n+n+1;
			n++;
	
			System.out.println(x+" "+i);
		}
		
		sc.close();

	}

}
