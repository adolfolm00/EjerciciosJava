package ejerciciosT4;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=10;
		int p=0;
		for(int i=0;i<10;i++) {
			System.out.println("Introduce "+n+" números");
			int x=sc.nextInt();
			p=p+x;
			n--;
		}
		System.out.println("La suma de todos los números es "+p);
			sc.close();
	}

}



