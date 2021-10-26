package arrayst08;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int[]n= new int[15];
		
		for(int i=0;i<15;i++) {
			System.out.println("Escribe el número "+(i+1));
			n[i]=sc.nextInt();
		}
		
		int aux= n[14];
		for(int i=14;i>0;i--) {
			n[i]=n[i-1];
		}
		n[0]=aux;
		
		
		
		
		sc.close();

	}

}
