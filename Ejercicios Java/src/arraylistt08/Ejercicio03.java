package arraylistt08;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer>n=new ArrayList<Integer>();
		
		for(int i=0;i<10;i++) {
			System.out.println("Escribe el número "+(i+1));
			n.add(sc.nextInt());
		}
		
		int max=0;
		int min=n.get(1);
		
		for(int i=0;i<n.size();i++) {
			if(n.get(i)>max) {
				max=n.get(i);
			}
			
			if(n.get(i)<min) {
				min=n.get(i);
			}
		}
		
		for(int i=0;i<n.size();i++) {
			
			if(n.get(i)==max) {
				System.out.println(n.get(i)+" Máximo");
			}
			else if(n.get(i)==min) {
				System.out.println(n.get(i)+ " Mínimo");
			}
			else {
				System.out.println(n.get(i));
			}
			
		}
		
		
		
		
		
		sc.close();

	}

}
