package HomerForEach;

import java.util.ArrayList;
import java.util.Scanner;

public class HomerForEach {

	public static void main(String[] args) {
		
		ArrayList<Integer> numprim=new ArrayList <Integer>();
		
		
		Scanner sc=new Scanner(System.in);
		int num;
		
		int rand= (int)(Math.random()*500+1);
		do {
			System.out.println("Intenta adivinar el número");
			System.out.println(rand);
			num=sc.nextInt();
			
			
			if(num>rand) {
				System.out.println("El random es menor");
			}
			else if(num==rand) {
				System.out.println("Has acertado");
			}
			else {
				System.out.println("El random es mayor");
			}
		}
		while(num!=rand);
		
	

	}

}
