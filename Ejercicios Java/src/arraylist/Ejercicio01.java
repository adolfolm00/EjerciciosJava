package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		ArrayList<Integer>n=new ArrayList<Integer>();
		
		do {
			System.out.println("Escribe un número");
			n.add(sc.nextInt());
		}
		while(sc.nextInt()!=-99);
		
		
		for(int i=0;i<n.size();i++) {
			if(n.get(i)==-99) {
				n.remove(i);
			}
		}
		
		
		for(int i=0;i<n.size();i++) {
			System.out.println(n.get(i));
		}
		
		int suma=0;
		
		for(int i=0;i<n.size();i++) {
			suma=suma+n.get(i);
		}
		
		int media;;
		
		media=suma/n.size();
		
		System.out.println("La suma es: "+suma);
		System.out.println("La media es: "+media);
		
		System.out.println("Números mayores que la media");
		for(int i=0;i<n.size();i++) {
			if(n.get(i)>media) {
				System.out.println(n.get(i));
			}
		}
		
		
		sc.close();

	}

}
