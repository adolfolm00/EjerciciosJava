package ejerciciosFechas;

import java.time.Duration;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int dia= Integer.parseInt(JOptionPane.showInputDialog("Dame el día"));
		int mes= Integer.parseInt(JOptionPane.showInputDialog("Dame el mes"));
		int anio=Integer.parseInt(JOptionPane.showInputDialog("Dame el año"));
		
		Calendar cal1= new GregorianCalendar();
		cal1.set(anio,mes-1,dia);
		
		Calendar cal2= new GregorianCalendar();
		cal2.set(2021,1,9);
		
		System.out.println(cal1.get(Calendar.DAY_OF_MONTH)+ "/"+(cal1.get(Calendar.MONTH))+"/"+(cal1.get(Calendar.YEAR)));
		System.out.println(cal2.get(Calendar.DAY_OF_MONTH)+"/"+(cal2.get(Calendar.MONTH))+"/"+(cal2.get(Calendar.YEAR)));
		
		
		int difdias= (int) Duration.between(cal1.toInstant(), cal2.toInstant()).toDays();
		System.out.println("La diferencia entre las dos fechas es: "+difdias+" días");
		
		
		
		
		
		

	}

}
