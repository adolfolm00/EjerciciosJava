package arrayst08bis;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int[][]n= new int[3][3];
		
		for(int f=0;f<n.length;f++) {
			for(int c=0;c<3;c++) {
				n[f][c]=0;
			}
		}
		
		for(int i=0;i<1;i++) {
			for(int x=0;x<1;x++) {
				i=(int)(Math.random()*2);
				x=(int)(Math.random()*2);
				
				n[i][x]=1;
			
			}
		}
		
		for(int f=0;f<n.length;f++) {
			for(int c=0;c<3;c++) {
				System.out.print(n[f][c]+"\t");
			}
			System.out.println();
		}
		
		
		int fila,columna;
		do {
			System.out.println("Escribe la fila en la que está el barco");
			fila=sc.nextInt();
			System.out.println("Escribe la columna en la que está el barco");
			columna=sc.nextInt();
			
			if (n[fila][columna]==1){
				System.out.println("Enhorabuena");
				System.exit(0);
			}
			else {
				System.out.println("Has fallado");
			}
		}
		while(n[fila][columna]!=1);
		
		
		sc.close();

	}

}
