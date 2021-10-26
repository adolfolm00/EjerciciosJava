package HerenciaNBA;

import java.util.Date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		
		Calendar cal=new GregorianCalendar();
		
		Jugador j1=new Jugador(11,10,2000,"Pau","Gasol",20,"Alero", 0);
		
		System.out.println(j1.toString());
	}
	


}
