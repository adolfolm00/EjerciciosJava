package javaNavidad;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner triangulo=new Scanner(System.in);
		Scanner circulo=new Scanner(System.in);
		System.out.println("Escribe triangulo o circulo para calcular el area");
		String area=sc.next();
		if(area.equalsIgnoreCase("triangulo")){
			System.out.println("Escribe la base");
			int base=triangulo.nextInt();
			System.out.println("Escribe la altura");
			int altura=triangulo.nextInt();
			System.out.println("El áera del triangulo es "+(base*altura));
		}
		else if(area.equalsIgnoreCase("circulo")) {
			System.out.println("Escribe el radio");
			int radio=circulo.nextInt();
			System.out.println("El radio del círculo es "+(2.1415*Math.pow(radio, 2)));
		}
		sc.close();
		triangulo.close();
		circulo.close();

	}

}
