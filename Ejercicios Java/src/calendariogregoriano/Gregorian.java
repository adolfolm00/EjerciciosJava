package calendariogregoriano;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Gregorian {

	public static void main(String[] args) {
		
		Calendar cal= new GregorianCalendar();
		int diasletras= cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)+1;
		String letras="Domingo";
		int diasmes= cal.get(Calendar.MONTH)+1;
		String mes="hola";
		
		
		switch(diasletras){
			
		case 1: letras="es Domingo";
			break;
			
		case 2: letras="es Lunes";
			break;
			
		case 3: letras="es Martes";
			break;
			
		case 4: letras="es Miércoles";
			break;
		
		case 5: letras="es Jueves";
			break;
		
		case 6: letras="es Viernes";
			break;
			
		case 7: letras="es Sábado";
			break;
			
		}
		
		switch(diasmes) {
			
		case 1: mes="es Enero";
			break;
			
		case 2: mes="es Febrero";
			break;
			
		case 3: mes="es Marzo";
			break;
		
		case 4: mes="es Abril";
			break;
			
		case 5: mes="es Mayo";
			break;
		
		case 6: mes="es Junio";
			break;
		
		case 7: mes="es Julio";
			break;
			
		case 8: mes="es Agosto";
			break;
		
		case 9: mes="es Septiembre";
			break;
			
		case 10: mes="es Octubre";
			break;
			
		case 11: mes="es Noviembre";
			break;
		
		case 12: mes="es Diciembre";
			break;
		
		}
		int diaano=cal.get(Calendar.DAY_OF_YEAR);
		
		
		System.out.println("Hoy es "+letras+" y "+mes);
		System.out.println("Estamos en el día " +diaano+"/365");

	}

}
