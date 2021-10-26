package ejerciciost7;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		int dado1=0;
		int dado2=0;
		int dado3=0;
			
		for(int i=0;i<1;i++) {
			dado1=(int)(Math.random()*6+1);
			System.out.println("El primer dado sale "+dado1);
		}
		
		for(int i=0;i<1;i++) {
			dado2=(int)(Math.random()*6+1);
			System.out.println("El segundo dado sale "+dado2);
		}
		
		for(int i=0;i<1;i++) {
			dado3=(int)(Math.random()*6+1);
			System.out.println("El tercer dado sale "+dado3);
		}
		
		System.out.println("La suma de los tres dados es "+(dado1+dado2+dado3));

	}

}
