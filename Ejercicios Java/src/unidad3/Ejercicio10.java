package unidad3;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		Scanner teclado1=new Scanner(System.in);
		Scanner teclado2=new Scanner(System.in);
		int descuento=0;
		int porcentaje=0;
		String iva;
		System.out.println("Escriba la base imponible");
		int base=teclado.nextInt();
		System.out.println("Escriba el tipo de IVA: general, reducido o superreducido");
		iva=teclado1.nextLine();
		
		switch(iva) {
		case "general":porcentaje=(21*base)/100;
		break;
		case "reducido":porcentaje=(10*base)/100;
		break;
		case "superreducido":porcentaje=(4*base)/100;
		}
		
		
		
		
		System.out.println("Escriba el código promocional: nopro, mitad, meno5 o 5porc");
		String codigo=teclado2.nextLine();
		if(codigo.equalsIgnoreCase("nopro")) {
			descuento=0;
		}
		else if(codigo.equalsIgnoreCase("mitad")) {
			descuento=base/2;
		}
		else if(codigo.equalsIgnoreCase("meno5")) {
			descuento=5;
		}
		System.out.println("Base imponible "+base);
		System.out.println("IVA "+porcentaje);
		System.out.println("Precio con IVA "+(base+porcentaje));
		System.out.println("Código promocional " +descuento);
		System.out.println("Total "+((base+porcentaje)-descuento));
		
		
		teclado.close();
		teclado1.close();
		teclado2.close();
		

	}

}
