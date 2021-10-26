package arraylistt08;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> n=new ArrayList<Integer>();
		
		for(int i=0;i<10;i++) {
			System.out.println("Escribe el número "+(i+1));
			n.add(sc.nextInt());
		}
		
		for(int i=n.size()-1;i>=0;i--) {
			System.out.println(n.get(i));
		}
		
		sc.close();

	}

}
