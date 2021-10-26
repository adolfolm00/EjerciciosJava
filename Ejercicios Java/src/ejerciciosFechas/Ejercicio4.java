package ejerciciosFechas;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Calendar cal1=new GregorianCalendar();
		
		int dia1,mes1,ano1,dianacimiento;
		
		
		System.out.println("Escribe el día que naciste");
		dia1=sc.nextInt();
		System.out.println("Escribe el mes que naciste");
		mes1=sc.nextInt();
		System.out.println("Escribe el año que naciste");
		ano1=sc.nextInt();
		
		cal1.set(ano1,mes1,dia1);
		
		dianacimiento=cal1.get(Calendar.DAY_OF_WEEK);
		
		if(dianacimiento==1) {
			System.out.println("Naciste el Domingo");
		}
		else if(dianacimiento==2) {
			System.out.println("Naciste el Lunes");
		}
		else if(dianacimiento==3) {
			System.out.println("Naciste el Martes");
		}
		else if(dianacimiento==4) {
			System.out.println("Naciste el Miércoles");
		}
		else if(dianacimiento==5) {
			System.out.println("Naciste el Jueves");
		}
		else if(dianacimiento==6) {
			System.out.println("Naciste el Viernes");
		}
		else if(dianacimiento==7) {
			System.out.println("Naciste el Sábado");
		}
	
		sc.close();
	}

}
