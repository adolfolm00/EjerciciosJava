package javaNavidad;

public class Random1a100 {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			int n= (int) (Math.random()*100+1);
			System.out.println(n);
		}

	}

}
