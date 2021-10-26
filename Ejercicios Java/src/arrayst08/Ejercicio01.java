package arrayst08;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int []n= new int[10];
		
		for(int i=0;i<n.length;i++) {
			System.out.println("Escribe el número "+(i+1));
			n[i]=sc.nextInt();
		}
		
		for(int i=9;i>=0;i--) {
			System.out.println(n[i]);
		}
		
		
		sc.close();

	}

}
