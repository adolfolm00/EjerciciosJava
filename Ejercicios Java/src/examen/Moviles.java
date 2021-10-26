package examen;

import java.util.Scanner;

public class Moviles {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	//definición de variables
		String marca,modelo;
		double pulgadas;
		int bateria,megapixeles,peso;
		
		//preguntamos cuantos móviles quiere comprar para saber el tamaño del array
		System.out.println("¿Cuántos móviles quieres comprar?");
		int tam=sc.nextInt();
		sc.nextLine();
		Movil m[]=new Movil[tam];//definimos el tamaño del array
		
		//for con los datos de cada móvil introducidos por teclado
		for(int i=0;i<m.length;i++) {
			System.out.println("Escribe la marca del móvil "+(i+1));
			marca=sc.nextLine();
			System.out.println("Escribe el modelo del móvil "+(i+1));
			modelo=sc.nextLine();
			System.out.println("Escribe las pulgadas del móvil "+(i+1));
			pulgadas=sc.nextDouble();
			System.out.println("Escribe la batería del móvil "+(i+1));
			bateria=sc.nextInt();
			System.out.println("Escribe los megapíxeles del móvil "+(i+1));
			megapixeles=sc.nextInt();
			System.out.println("Escribe el peso del móvil "+(i+1));
			peso=sc.nextInt();
			
			sc.nextLine();//buffer
			
			System.out.println("------------------");
			
			m[i]=new Movil(marca,modelo,pulgadas,bateria,megapixeles,peso);
			
		}
		//mostramos por pantalla los datos de todos los móviles
		for(int i=0;i<m.length;i++) {
			System.out.println(m[i].toString());
		}
		
		
		
		
		sc.close();

	}

}
