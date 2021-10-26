package arrayst08bis;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int [][]n=new int[3][3];
		
		for(int f=0;f<n.length;f++) {
			for(int c=0;c<n[2].length;c++) {
				System.out.println("Escribe el número para la posición: ["+f+"]["+c+"]");
				n[f][c]=sc.nextInt();
			}
			
		}
		
		for(int f=0;f<n.length;f++) {
			for(int c=0;c<n.length;c++) {
				System.out.print(n[f][c]+"\t");
			}
			System.out.println();
		}
		int aux;
		for(int f=0;f<n.length;f++) {
			for(int c=0;c<n.length;c++) {
				if(f==c) {
					aux=n[0][0];
					n[0][0]=n[2][2];
					n[2][2]=aux;
					
				}
			}
		}
		
		System.out.println();
		
		for(int f=0;f<n.length;f++) {
			for(int c=0;c<n.length;c++) {
				System.out.print(n[f][c]+"\t");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
