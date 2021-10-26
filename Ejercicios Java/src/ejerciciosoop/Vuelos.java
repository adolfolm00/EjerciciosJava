package ejerciciosoop;

import java.util.Scanner;

public class Vuelos {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String origen,destino;
		int kms;
		
		Vuelo aeropuerto[]= new Vuelo[5];
		
		for(int i=0;i<aeropuerto.length;i++) {
			System.out.println("Introduzca el Origen del vuelo"+(i+1));
			origen=sc.nextLine();
			System.out.println("Introduzca el Destino del vuelo"+(i+1));
			destino=sc.nextLine();
			System.out.println("Introduzca la distancia del vuelo"+(i+1));
			kms=sc.nextInt();
			sc.nextLine();
			
			aeropuerto[i]=new Vuelo(origen,destino,kms);
		}
		
		
		for(int i=0;i<aeropuerto.length;i++) {
			System.out.println(aeropuerto[i].toString());
		}
		
		sc.close();

	}

}
