package unidad3;

import java.util.Scanner;

public class Ejercicio9 {

	private static int mb;
	private static int kb;

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Escriba 1 si desea pasar de Mb a Kb");
		System.out.println("Escriba 2 si desea pasar de Kb a Mb");
		int n=teclado.nextInt();
		
		switch(n){
		case 1:
			System.out.println("Introduzca la cantidad de Mb");
			mb = teclado.nextInt();
			System.out.println(mb+" Mb equivalen a "+mb*1000+" Kb");
			break;
		case 2:
			System.out.println("Introduzca la cantidad de Kb");
			kb = teclado.nextInt();
			System.out.println(kb+" Kb equivalen a "+kb/1000+" Mb");
			break;
	}
		teclado.close();

}
}
