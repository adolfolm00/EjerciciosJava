package ejerciciost5;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Escribe triangulo o circulo para calcular el área de los anteriores");
		String n=sc.next();
		int base,altura,radio;
		double area;
			if(n.equalsIgnoreCase("Triangulo")) {
				System.out.println("Escriba la base del triángulo");
				base=sc.nextInt();
				System.out.println("Escribe la altura del triángulo");
				altura=sc.nextInt();
				area=base*altura;
				System.out.println("El área del triángulo es "+(int)area);
			}
			else if(n.equalsIgnoreCase("Circulo")) {
				System.out.println("Escribe el radio del círculo");
				radio=sc.nextInt();
				area=(Math.pow(radio,2)*3.1415);
				System.out.println("El área del círculo es "+area);
			}
		
		sc.close();

	}

}
