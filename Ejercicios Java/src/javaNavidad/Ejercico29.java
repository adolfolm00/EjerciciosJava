package javaNavidad;

import java.util.Scanner;

public class Ejercico29 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		do {
		System.out.println("Escribe un número");
			n=sc.nextInt();
		}
		while(n<0 || n==0  );
		System.out.println(n);
		
		sc.close();

	}

}
