package arrayst08;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int []nuevo= new int[20];
		int []cuadrado= new int[20];
		int []cubo= new int [20];
		
		for(int i=0;i<nuevo.length;i++) {
			nuevo[i]=(int)(Math.random()*100);
			cuadrado[i]=(int)(Math.pow(nuevo[i],2));
			cubo[i]=(int)(Math.pow(nuevo[i], 3));
		}
		
		for(int i=0;i<nuevo.length;i++) {
			System.out.println(nuevo[i]+"\t"+cuadrado[i]+"\t"+cubo[i]);
		}
		
		
		sc.close();

	}

}
