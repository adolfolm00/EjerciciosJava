package arrayst08;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int []n= new int[10];
		
		for(int i=0;i<10;i++) {
			System.out.println("Escribe el número "+(i+1));
			n[i]=sc.nextInt();
		}
		int max=0;
		int min=0
				;
		for(int i=0;i<10;i++) {
			if(n[i]>max) {
				max=n[i];
			}
		}
		
		min=n[0];
		for(int i=0;i<10;i++) {
			if(n[i]<min) {
				min=n[i];
			}
		}
		
		for(int i=0;i<10;i++){
			
			
			if(n[i]==max) {
				System.out.println(max+" Máximo");
			}
			else if(n[i]==min) {
				System.out.println(min+" Mínimo");
			}
			else {
				System.out.println(n[i]);
			}
		}
		
		
		
		sc.close();

	}

}
