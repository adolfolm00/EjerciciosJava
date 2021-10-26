package ejerciciosT4;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Escribe un número de tres cifras");
		int n=sc.nextInt();
		
			for(int i=0;i<String.valueOf(n).length();i++) {
				System.out.print(String.valueOf(n).charAt(i)+" ");
			}
		sc.close();

	}

}
