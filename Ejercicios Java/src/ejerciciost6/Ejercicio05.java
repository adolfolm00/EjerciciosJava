package ejerciciost6;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		int cont=0;
		int n=0;
		int p=4;
		
			do {
				System.out.println("Introduzca la contraseña de la caja fuerte");
				n=sc.nextInt();
				++cont;
				if(n==1234) {
					System.out.println("Has accedido a la caja fuerte");
				}
				else {
					System.out.println("Contraseña incorrecta, le quedan "+--p+" intentos");
				}
			}
			while(n!=1234 & cont<4);
		
		
		sc.close();

	}

}
