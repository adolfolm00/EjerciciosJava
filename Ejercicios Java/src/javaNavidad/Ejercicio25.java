package javaNavidad;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe un día de la semana en letras y se determinará si es laborable o no");
		String n=sc.next();
		
		switch(n){
		case "lunes":System.out.println("Es laborable");
		break;
		case "martes": System.out.println("Es laborable");
		break;
		case "miércoles": System.out.println("Es laborable");
		break;
		case "jueves": System.out.println("Es laborable");
		break;
		case "viernes": System.out.println("Es laborable");
		break;
		case "sabado": System.out.println("No es laborable");
		break;
		case "domingo": System.out.println("No es laborable");
			
		}
		
		sc.close();

	}

}
