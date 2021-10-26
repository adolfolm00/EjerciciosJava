package examen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio1Adolfo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer>n=new ArrayList<Integer>();
		
		//metemos los datos random en el arraylist
		int rand;
		for(int i=0;i<9;i++) {
			rand=(int)(Math.random()*20+1);
			n.add(rand);
			
		}
		//sacamos por pantalla los random
		System.out.println("Números generados aleatoriamente");
		for(int i=0;i<n.size();i++) {
			System.out.println(n.get(i));
		}
		
		Collections.sort(n);//este comando ayuda a ordenar el arraylist
		System.out.println();
		//ordenamos el arraylist
		System.out.println("Números ordenados");
		for(Integer i:n) {
			System.out.println(i);
		}
		System.out.println();
		
		//sacamos por pantalla el array ordenado con el número añadido
		System.out.println("Introduzca un número en el array");
		n.add(sc.nextInt());
		System.out.println("Números ordenados con el añadido");
		Collections.sort(n);
		
		for(Integer i:n) {
			System.out.println(i);
		}
		
		
		
		sc.close();

	}

}
