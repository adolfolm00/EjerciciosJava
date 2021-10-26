package arrayst08;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n[]=new int[12];
		for(int i=0;i<12;i++) {
			System.out.println("Escribe la temperatura del mes "+(i+1));
			n[i]=sc.nextInt();
		}
		
		for(int i=0;i<1;i++) {
			System.out.print("Enero \t\t");
			for(int m=0;m<n[0];m++) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		for(int i=0;i<1;i++) {
			System.out.print("Febrero \t");
			for(int m=0;m<n[1];m++) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		for(int i=0;i<1;i++) {
			System.out.print("Marzo \t\t");
			for(int m=0;m<n[2];m++) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		for(int i=0;i<1;i++) {
			System.out.print("Abril \t\t");
			for(int m=0;m<n[3];m++) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		for(int i=0;i<1;i++) {
			System.out.print("Mayo \t\t");
			for(int m=0;m<n[4];m++) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		for(int i=0;i<1;i++) {
			System.out.print("Junio \t\t");
			for(int m=0;m<n[5];m++) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		for(int i=0;i<1;i++) {
			System.out.print("Julio \t\t");
			for(int m=0;m<n[6];m++) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		for(int i=0;i<1;i++) {
			System.out.print("Agosto \t\t");
			for(int m=0;m<n[7];m++) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		for(int i=0;i<1;i++) {
			System.out.print("Septiembre \t");
			for(int m=0;m<n[8];m++) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		for(int i=0;i<1;i++) {
			System.out.print("Octubre \t");
			for(int m=0;m<n[9];m++) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		for(int i=0;i<1;i++) {
			System.out.print("Noviembre \t");
			for(int m=0;m<n[10];m++) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		for(int i=0;i<1;i++) {
			System.out.print("Diciembre \t");
			for(int m=0;m<n[11];m++) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		sc.close();

	}

}
