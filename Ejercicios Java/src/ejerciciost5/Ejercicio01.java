package ejerciciost5;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Escribe un número y se determinará cuantos digitos tiene");
		int n=sc.nextInt();
		
			if(Integer.toString(n).length()==1) {
			System.out.println(n+" tiene 1 dígito");
			}
				else if(Integer.toString(n).length()==2) {
					System.out.println(n+" tiene 2 dígitos");
				}
				else if(Integer.toString(n).length()==3) {
					System.out.println(n+" tiene 3 dígitos");
				}
				else if(Integer.toString(n).length()==4) {
					System.out.println(n+" tiene 4 dígitos");
				}
				else {
					System.out.println(n+" tiene más de 4 dígitos");
				}
		
		sc.close();

	}

}
