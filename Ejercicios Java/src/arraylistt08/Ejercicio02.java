package arraylistt08;

import java.util.ArrayList;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		ArrayList<Integer>numero= new ArrayList<Integer>();
		ArrayList<Integer>cuadrado= new ArrayList<Integer>();
		ArrayList<Integer>cubo= new ArrayList<Integer>();
		
		for(int i=0;i<20;i++) {
			int aleatorio=(int)(Math.random()*100);
			numero.add(aleatorio);
			cuadrado.add((int) Math.pow(aleatorio, 2));
			cubo.add((int)Math.pow(aleatorio, 3));
		}
		
		for(int i=0;i<numero.size();i++) {
			System.out.println("Número: "+numero.get(i)+"\t"+"Cuadrado: "+cuadrado.get(i)+"\t"+"Cubo: "+cubo.get(i));
		}
		
		

	}

}
