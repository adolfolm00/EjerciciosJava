package ejerciciost6;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce el número del cual quieres la tabla de multiplicar");
		int n=sc.nextInt();
		
		for(int i=0;i<=10;i++) {
			System.out.println(n+"*"+i+" es igual a "+n*i);
		}
		sc.close();

	}

}
