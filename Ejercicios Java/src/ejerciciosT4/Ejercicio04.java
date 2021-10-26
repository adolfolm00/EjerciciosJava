package ejerciciosT4;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Escribe la hora");
		int n=sc.nextInt();
		
			if(n==9 || n==10 || n==11) {
				System.out.println("Buenos días");
			}
			else if(n==12 || n==13 || n==14 || n==15 || n==16 || n==17||n==18 || n==19 || n==20) {
				System.out.println("Buenas tardes");
			}
			else {
				System.out.println("Buenas noches");
			}
		
		
		
		
		
		sc.close();

	}

}
