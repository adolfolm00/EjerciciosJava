package ejerciciost7;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int rand=0;
		for(int i=0;i<1;i++) {
			rand=(int)(Math.random()*100);
			System.out.println(rand);
		}
		
		int cont=0;
		int num=5;
		int n=0;
		
		for(int i=0;i<5;i++) {
			
			System.out.println("Adivina el número random, tienes "+num+" intentos");
			n=sc.nextInt();
			cont++;
			num--;
			
			if(n==rand) {
				System.out.println("Enhorabuena, has acertado");
				System.exit(0);
			}
			else if(n!=rand){
				if(n<rand) {
					System.out.println("El número que has escrito es menor que el random");
				}
				else if(n>rand) {
					System.out.println("El número que has escrito es mayor al random");
				}
			}
			
			if(cont>=5) {
				System.out.println("Has gastado los intentos");
				System.exit(0);
			}
			
		}
		
		sc.close();

	}

}
