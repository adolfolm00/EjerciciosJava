package arrayst08;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int [][]n= new int[3][3];
		
		for(int f=0;f<n.length;f++) {
			for(int c=0;c<n[2].length;c++) {
				n[f][c]=0;
			}
		}
		
		for(int f=0;f<1;f++) {
			for(int c=0;c<1;c++) {
				f=(int)(Math.random()*2);
				c=(int)(Math.random()*2);
				n[f][c]=1;
			}
		}
		
		for(int f=0;f<n.length;f++) {
			for(int c=0;c<n[2].length;c++) {
				System.out.print(n[f][c]+"\t");
			}
			System.out.println();
		}
		int filabarco;
		int colbarco;
	
		
		
		do {
			System.out.println("Escribe la fila en la que está el barco");
			filabarco=sc.nextInt();
			System.out.println("Escribe la columna en la que está el barco");
			colbarco=sc.nextInt();
				if(n[filabarco][colbarco]==1) {
					System.out.println("Has acertado");
					System.exit(0);
				}
				else {
					System.out.println("Has fallado");
				}
		
		}
		while(n[filabarco][colbarco]!=1);
		sc.close();
		

	
	}

}
