package javaNavidad;


public class Ejercicio20 {

	public static void main(String[] args) {
		int n=1;
		int x;
		int z=0;
		for(int i=0;i<=100;i++) {
			x=n*n;
			z=x+x;
			n++;
		}
		System.out.println(z);
	}

}
