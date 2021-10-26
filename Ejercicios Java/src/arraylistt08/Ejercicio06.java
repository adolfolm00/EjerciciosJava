package arraylistt08;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer>n=new ArrayList<Integer>();
		
		for(int i=0;i<12;i++) {
			System.out.println("Escribe la temperatura del mes "+(i+1));
			n.add(sc.nextInt());
		}
		
		for(int i=0;i<1;i++) {
			System.out.print("Enero \t\t");
			for(int x=0;x<n.get(0);x++) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		for(int i=0;i<1;i++) {
			System.out.print("Febrero \t");
			for(int x=0;x<n.get(1);x++) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		for(int i=0;i<1;i++) {
			System.out.print("Marzo \t\t");
			for(int x=0;x<n.get(2);x++) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		for(int i=0;i<1;i++) {
			System.out.print("Abril \t\t");
			for(int x=0;x<n.get(3);x++) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		for(int i=0;i<1;i++) {
			System.out.print("Mayo \t\t");
			for(int x=0;x<n.get(4);x++) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		for(int i=0;i<1;i++) {
			System.out.print("Junio \t\t");
			for(int x=0;x<n.get(5);x++) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		for(int i=0;i<1;i++) {
			System.out.print("Julio \t\t");
			for(int x=0;x<n.get(6);x++) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		for(int i=0;i<1;i++) {
			System.out.print("Agosto \t\t");
			for(int x=0;x<n.get(7);x++) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		for(int i=0;i<1;i++) {
			System.out.print("Septiembre \t");
			for(int x=0;x<n.get(8);x++) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		for(int i=0;i<1;i++) {
			System.out.print("Octubre \t");
			for(int x=0;x<n.get(9);x++) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		for(int i=0;i<1;i++) {
			System.out.print("Noviembre \t");
			for(int x=0;x<n.get(10);x++) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		for(int i=0;i<1;i++) {
			System.out.print("Diciembre \t");
			for(int x=0;x<n.get(11);x++) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		
		sc.close();

	}

}
