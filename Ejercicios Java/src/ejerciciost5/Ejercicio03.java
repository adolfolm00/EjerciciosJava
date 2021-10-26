package ejerciciost5;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Escribe el primer número");
		int n1=sc.nextInt();
		System.out.println("Escribe el segundo número");
		int n2=sc.nextInt();
		System.out.println("Escribe el tercer número");
		int n3=sc.nextInt();
		
		int max=0,med=0,min=0;
		
		for(int i=0;i<3;i++) {
		if(n1>n2 && n1>n3) {
			max=n1;
		}
		else if(n1>n2 && n1<n3) {
			med=n1;
		}
		else if(n1<n2 && n1>n3) {
			med=n1;
		}
		else if(n1<n2 && n1<n3) {
			min=n1;
		}
		}
		
		for(int i=0;i<3;i++) {
			if(n2>n1 && n2>n3) {
				max=n2;
			}
			else if(n2>n1 && n2<n3) {
				med=n2;
			}
			else if(n2<n1 && n2>n3) {
				med=n2;
			}
			else if(n2<n1 && n2<n3) {
				min=n2;
			}
		}
		
		for(int i=0;i<3;i++) {
			if(n3>n1 && n3>n2) {
				max=n3;
			}
			else if(n3>n1 && n3<n2) {
				med=n3;
			}
			else if(n3<n1 && n3>n2) {
				med=n3;
			}
			else if(n3<n1 && n3<n2) {
				min=n3;
			}
		}
		
		System.out.println(min+"\t"+med+"\t"+max);
		
		sc.close();

	}

}
