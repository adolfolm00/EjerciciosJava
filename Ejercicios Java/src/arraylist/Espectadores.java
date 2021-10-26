package arraylist;

import java.util.Scanner;

public class Espectadores {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int tam;
		int edad;
		String nombre;
		System.out.println("Escribe el tamaño de los espectadores");
		tam=sc.nextInt();
		sc.nextLine();
		Espectador e[]=new Espectador[tam];
		
		
		for(int i=0;i<e.length;i++) {
			System.out.println("Escribe el nombre del espectador");
			nombre=sc.nextLine();
			System.out.println("Escribe la edad");
			edad=sc.nextInt();
			sc.nextLine();
			
			e[i]=new Espectador(nombre,edad);
		}
		
		for(int i=0;i<e.length;i++) {
			System.out.println(e[i].toString());
		}
		
		sc.close();
		

	}

}
