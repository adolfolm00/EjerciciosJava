package arrayHomer;

import java.util.Scanner;

public class Homerarray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		float [] n= new float[19];
		float media=0;
		for(int i=0;i<=n.length;i++) {
			System.out.println("Escribe la nota del alumno "+(i+1));
			n[i]=sc.nextFloat();
		}
		
		for(int i=0;i<=n.length;i++) {
			media=media+n[i];
		}
		
		System.out.println("La media es "+media/n.length);
		
		
		sc.close();

	}

}
