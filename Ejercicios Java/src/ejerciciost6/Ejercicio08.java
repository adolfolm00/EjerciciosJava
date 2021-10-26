package ejerciciost6;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Introduce los números que quieres de la serie de fibonacci");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println(i);
			i=i+1;
		}
		
		sc.close();

	}

}
