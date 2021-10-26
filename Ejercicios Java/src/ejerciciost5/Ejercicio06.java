package ejerciciost5;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe el precio de su producto");
		int precio=sc.nextInt();
		int descuento;
		int preciofinal;
			if(precio<=300) {
				System.out.println("No tiene descuento, su precio a pagar es "+precio+" euros");
			}
			else {
				descuento=(precio*20)/100;
				preciofinal=precio-descuento;
				System.out.println("Su descuento es de "+descuento+" euros, el precio final a pagar es de "+preciofinal+" euros");
			}
		sc.close();

	}

}
