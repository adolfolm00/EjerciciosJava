package arrayst08bis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Pruebaa {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer>n=new ArrayList<Integer>();
		
		for(int i=0;i<3;i++) {
			System.out.println("Escribe un número");
			n.add(sc.nextInt());
			Collections.sort(n);
		}
		
		for(Integer x:n) {
			System.out.println(x);
		}
		sc.close();
		
		

	}

}
