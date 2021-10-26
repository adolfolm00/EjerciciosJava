package arrayObjetos;

import java.util.Scanner;

public class Youtubers {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int numyt;
		String alias,pais;
		int seguidores,videos,anocuenta;
		System.out.println("¿Cuántos youtubers hay?");
		numyt=sc.nextInt();
		sc.nextLine();
		
		Youtuber y[]= new Youtuber[numyt];
		
		for(int i=0;i<y.length;i++) {
			System.out.println("Escribe el alias del youtuber "+(i+1));
			alias=sc.nextLine();
			System.out.println("Escribe el número de seguidores del youtuber "+(i+1));
			seguidores=sc.nextInt();
			System.out.println("Escribe el número de videos del youtuber "+(i+1));
			videos=sc.nextInt();
			sc.nextLine();
			System.out.println("Escribe el país del youtuber "+(i+1));
			pais=sc.nextLine();
			System.out.println("Escribe el año de la cuenta "+(i+1));
			anocuenta=sc.nextInt();
			
			y[i]= new Youtuber(alias,seguidores,videos,pais,anocuenta);
			
			System.out.println("-----------");
			sc.nextLine();
		}
		
		
		
		
		for(int i=0;i<y.length;i++) {
			System.out.println(y[i].toString());
		}
		
		
		sc.close();

	}

}
