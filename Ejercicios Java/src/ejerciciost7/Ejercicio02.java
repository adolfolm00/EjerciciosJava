package ejerciciost7;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		int n=0;
		int max=0;
		int min=0;
		int p=0;
		int x=0;
		
		for(int i=0;i<50;i++) {
			n=(int)(Math.random()*(199-100)+100);
			System.out.println(n);
			p=p+n;
			x=n+0;
			
			
			if(n>x) {
				max=(int)n;
			}
			else if(n<n) {
				min=n;
			}
		}
		System.out.println(max);
		System.out.println("La media es "+(p/50));
		System.out.println(min);

	}

}
