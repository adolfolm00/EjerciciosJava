package arrayHomer;

import java.util.Scanner;

public class Homerarray3 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int[][]n=new int[3][2];
		
		for(int f=0;f<3;f++) {
			for(int c=0;c<2;c++) {
				System.out.println("Escribe el número para la posición: ["+f+"]["+c+"]");
				n[f][c]=sc.nextInt();
			}
		}
		
		for(int f=0;f<3;f++) {
			for(int c=0;c<2;c++) {
				System.out.print(n[f][c]+"\t");
			}
			System.out.println();
		}
		
		
		
		
		sc.close();

	}

}
