package arraylistt08;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer>n=new ArrayList<Integer>();
		
		int random;
		for(int i=0;i<100;i++) {
			random=(int)(Math.random()*500);
			n.add(random);
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
			System.out.println(n.get(i));
		}
		String respuesta;
		System.out.println("¿Quiéres destacar el máximo y mínimo?");
		respuesta=sc.next();
		if(respuesta.equalsIgnoreCase("Si")) {
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
			
		}
		else {
			System.exit(0);
		}
		
		sc.close();

	}

}
