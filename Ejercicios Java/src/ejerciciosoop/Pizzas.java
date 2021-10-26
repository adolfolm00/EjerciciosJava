package ejerciciosoop;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Pizzas {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int numpizza;
		System.out.println("¿Cuántas pizzas quieres pedir?");
		numpizza=sc.nextInt();
		
		int numeropizza,tamañopizza,fecha,ingextra,repartopizza;
		String reparto="a",nombre="a",tamaño="a";
		Pizza p[]=new Pizza[numpizza];
		
		
		Calendar c=new GregorianCalendar();
		
		for(int i=0;i<p.length;i++){
			System.out.println();
			System.out.println("Elige el tipo de pizza");
			System.out.println("1.Barbacoa");
			System.out.println("2.Carbonara");
			System.out.println("3.Margarita");
			System.out.println("4.Hawaiana");
			numeropizza=sc.nextInt();
			switch(numeropizza) {
			case 1:nombre="Barbacoa";
				break;
			case 2:nombre="Carbonara";
				break;
			case 3:nombre="Margarita";
				break;
			case 4:nombre="Hawaiana";
				break;
			}
			
			System.out.println();
			System.out.println("¿Cuántos ingredientes extra quieres?");
			ingextra=sc.nextInt();
			
			System.out.println();
			System.out.println("Elige el tamaño");
			System.out.println("1.Pequeña");
			System.out.println("2.Mediana");
			System.out.println("3.Grande");
			tamañopizza=sc.nextInt();
			switch(tamañopizza) {
			case 1:tamaño="Pequeña";
				break;
			case 2:tamaño="Mediana";
				break;
			case 3:tamaño="Grande";
				break;
			}
			System.out.println();
			System.out.println("1.A domicilio");
			System.out.println("2.Recoger en local");
			repartopizza=sc.nextInt();
			switch(repartopizza) {
			case 1:reparto="A domicilio";
				break;
			case 2:reparto="Recoger";
				break;
			}
			
			fecha=c.get(Calendar.DAY_OF_WEEK);
			
			p[i]=new Pizza(nombre,ingextra,tamaño,reparto,fecha);
			
		}
		
		
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i].toString());
		}
		sc.close();

	}

}
