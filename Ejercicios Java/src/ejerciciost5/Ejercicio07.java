package ejerciciost5;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Eustaquio cumple el 28 de Febrero, introduce el año para saber si podrá celebrarlo");
		int year=sc.nextInt();
		
			if(year%4==0 && year%100!=0) {
				System.out.println("Eustaquio podrá celebrar el cumple");
			}
			else if(year%400==0) {
				System.out.println("Eustaquio podrá celebrar el cumple");
			}
			else {
				System.out.println("Eustaquio no podrá celebrar el cumple");
			}
			
		sc.close();

	}

}
