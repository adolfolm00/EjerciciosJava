package unidad3;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Escriba el la base del rectángulo");
		int base=teclado.nextInt();
		System.out.println("Escriba la altura del rectángulo");
		int altura=teclado.nextInt();
		System.out.println("El área del rectángulo es "+base*altura);
		teclado.close();

	}

}
