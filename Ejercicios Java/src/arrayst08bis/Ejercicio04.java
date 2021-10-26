package arrayst08bis;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int [][]n= new int[3][5];
		
		for(int f=0;f<n.length;f++) {
			for(int c=0;c<n[2].length;c++) {
				System.out.println("Escribe el número para la posición: ["+f+"]["+c+"]");
				n[f][c]=sc.nextInt();
			}
		}
		
		
		for(int f=0;f<n.length;f++) {
			for(int c=0;c<n[2].length;c++) {
				System.out.print(n[f][c]+"\t");
			}
			System.out.println();
		}
		
		
		System.out.println("Escribe el elemento e");
		int e=sc.nextInt();
		
		for(int f=0;f<n.length;f++) {
			for(int c=0;c<n[2].length;c++) {
				if(n[f][c]==e) {
					System.out.println("El elemento e: "+e+" está en la posición: ["+f+"]["+c+"]");
					System.exit(0);
				}
			}
		}
		
		
		
		
		sc.close();

	}

}
