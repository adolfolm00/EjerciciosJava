package unidad3;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Escriba el precio de la factura");
		int factura=teclado.nextInt();
		factura/=1.21;
		System.out.println("La base imponible es "+factura);
		teclado.close();

	}

}
