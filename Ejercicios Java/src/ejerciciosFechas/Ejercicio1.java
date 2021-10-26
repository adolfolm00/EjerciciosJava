package ejerciciosFechas;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Calendar cal=new GregorianCalendar();
		
		int dia=cal.get(Calendar.DAY_OF_MONTH);
		int mes=cal.get(Calendar.MONTH)+1;
		int ano=cal.get(Calendar.YEAR);
		
		System.out.println(dia+"/"+mes+"/"+ano);

	}

}
