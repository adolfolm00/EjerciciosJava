package ejerciciost7;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		int n=0;
		int cont=0;
		do {
			n=(int)(Math.random()*100);
			
			if(n%2==0) {
				System.out.println(n);
				cont++;
			}
		}
		while(n!=24);
		System.out.println("Se han generado "+cont+" números");

	}

}
