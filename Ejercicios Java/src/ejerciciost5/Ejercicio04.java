package ejerciciost5;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner recuperacion=new Scanner(System.in);
		System.out.println("Escribe la nota del primer examen");
		int ex1=sc.nextInt();
		System.out.println("Escribe la nota del segundo examen");
		int ex2=sc.nextInt();
		
		int media=(ex1+ex2)/2;
		String recup;
		if(media>=5) {
			System.out.println("Estas aprobado, tu media es "+media);
		}
		else {
			System.out.println("Estas suspenso, escribe el resultado de tu recuperación");
			System.out.println("Apto o no apto");
			recup=recuperacion.nextLine();
			if(recup.equalsIgnoreCase("Apto")) {
				System.out.println("Tu media es un 5");
			}
			else {
				System.out.println("Tu media es "+media);
			}
			
		}
		
		
		
		sc.close();
		recuperacion.close();

	}

}
