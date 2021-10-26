package unidad3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Escriba una cantidad en euros y se transformarán a pesetas");
		int euros=teclado.nextInt();
		
		System.out.println("Equivalen a "+euros*166.386+" pesetas");
		teclado.close();
	}

}