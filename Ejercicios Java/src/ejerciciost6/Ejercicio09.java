package ejerciciost6;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int p=10;
		int positivo=0,negativo=0;
		for(int i=0;i<10;i++) {
			System.out.println("Escribe "+p+" números");
			p--;
			int n=sc.nextInt();
			
				if(n>0) {
					positivo++;
				}
				else if(n<0) {
					negativo++;
				}
		}
		System.out.println("Has escrito "+positivo+" números positivos");
		System.out.println("Has escrito "+negativo+" números negativos");
		
		
		sc.close();

	}

}
