package arrayst08;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int[]n=new int[20];
		
		for(int i=0;i<20;i++) {
			n[i]=(int)(Math.random()*20);
		}
		
		int contpar=0;
		for(int i=0;i<20;i++) {
			if(n[i]%2==0) {
				contpar++;
			}
		}
		
		for(int i=0;i<n.length;i++) {
			do {
				if(n[i]%2==0) {
					n[i]=i;
				}
			}
			while(i<contpar);
			n[i]=i;
		}
		
		for(int i=0;i<20;i++) {
			System.out.println(n[i]);
		}
		
		
		
		
		
		
		
		sc.close();

	}

}
