package arrayst08bis;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n[][]=new int[2][2];
		
		for(int f=0;f<2;f++) {
			for(int c=0;c<2;c++) {
				System.out.println("Introduce un número para la posición: ["+f+"]["+c+"]");
				n[f][c]=sc.nextInt();
			}
		}
		
		int aux=0;
	
		
		for(int f=0;f<n.length;f++) {
			for(int c=0;c<n[1].length;c++) {
				System.out.print(n[f][c]+"\t");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
