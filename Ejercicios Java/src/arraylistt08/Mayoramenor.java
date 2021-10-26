package arraylistt08;

import java.util.Scanner;

public class Mayoramenor {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int tam=0;
		
		
		System.out.println("Escribe el tamaño del array");
		tam=sc.nextInt();
		int[]n=new int[2];
		for(int i=0;i<2;i++) {
			System.out.println("Escribe el número "+(i+1));
			n[i]=sc.nextInt();
		}
		
		int aux=0;
		
		for(int i=0;i<2;i++) {
			if(n[i]>n[i+1]) {
				aux=n[i];
				n[i]=n[i+1];
				n[i+1]=aux;
			}
		}
		
		for(int i=0;i<2;i++) {
			System.out.println(n[i]);
		}
		
		
		
		sc.close();

	}

}
