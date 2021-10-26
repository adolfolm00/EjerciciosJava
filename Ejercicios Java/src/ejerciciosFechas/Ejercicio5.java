package ejerciciosFechas;

import java.time.Duration;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Calendar cal1=new GregorianCalendar();
		Calendar inicioano= new GregorianCalendar();
		Calendar anonuevo=new GregorianCalendar();
		
		
		
		int dia1,mes1,ano1,diasem,diasiguiente,difdias,diasanonuevo;
		
		System.out.println("Escribe el día de la fecha");
		dia1=sc.nextInt();
		System.out.println("Escribe el mes de la fecha");
		mes1=sc.nextInt();
		System.out.println("Escribe el año de la fecha");
		ano1=sc.nextInt();
		
		cal1.set(ano1, mes1, dia1);
		
		diasem=cal1.get(Calendar.DAY_OF_WEEK);
		
		if(diasem==1) {
			System.out.println("Es Domingo");
		}
		else if(diasem==2) {
			System.out.println("Es Lunes");
		}
		else if(diasem==3) {
			System.out.println("Es Martes");
		}
		else if(diasem==4) {
			System.out.println("Es Miércoles");
		}
		else if(diasem==5) {
			System.out.println("Es Jueves");
		}
		else if(diasem==6) {
			System.out.println("Es Viernes");
		}
		else if(diasem==7) {
			System.out.println("Es Sábado");
		}
		System.out.println();
		
		System.out.println("El día siguiente es: "+(diasem+1));
		
		//Calculamos los días que han pasado desde principio de año
		inicioano.set(ano1, 0,0);
		difdias=(int) Duration.between(inicioano.toInstant(), cal1.toInstant()).toDays();
		System.out.println();
		System.out.println("Los días que han pasado desde principio de año son: "+difdias);
		System.out.println();
		
		//Calculamos los días que quedan para año nuevo
		anonuevo.set(ano1+1, 0,0);
		diasanonuevo=(int) Duration.between(cal1.toInstant(), anonuevo.toInstant()).toDays();
		System.out.println("Quedan: "+diasanonuevo+" días para año nuevo");
		
		
		sc.close();

	}

}
