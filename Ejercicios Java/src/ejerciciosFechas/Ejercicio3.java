package ejerciciosFechas;

import java.time.Duration;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		
		Calendar cal1=new GregorianCalendar();
		Calendar cal2=new GregorianCalendar();
		
		int dia1,mes1,ano1,dia2,mes2,ano2;
		
		System.out.println("Escribe tu fecha de nacimiento ");
		System.out.println("Día");
		dia1=sc.nextInt();
		System.out.println("Mes");
		mes1=sc.nextInt();
		System.out.println("Año");
		ano1=sc.nextInt();
		
		cal1.set(ano1,mes1,dia1);
		
		
		dia2=cal2.get(Calendar.DAY_OF_MONTH);
		mes2=cal2.get(Calendar.MONTH)+1;
		ano2=cal2.get(Calendar.YEAR);
		
		cal2.set(ano2, mes2, dia2);
		
		int difanos;
		
		difanos=(int) Duration.between(cal1.toInstant(), cal2.toInstant()).toDays();
		
		if(difanos>=6570) {
			System.out.println("Eres mayor de edad");
		}
		else {
			System.out.println("Eres menor de edad");
		}
		
		
		
		sc.close();

	}

}
