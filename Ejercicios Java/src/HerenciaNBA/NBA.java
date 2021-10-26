package HerenciaNBA;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;


public class NBA {
	
	private String nombre;
	private String apellidos;
	private Date fechaNac;
	private int edad;
	
	
	
	public NBA(int dia,int mes,int annio,String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad=edad;
		
		Calendar cal=Calendar.getInstance();
		
		cal.set(annio, (mes-1),dia);
		
		this.fechaNac=cal.getTime();
		
		Date today;
		today=Calendar.getInstance().getTime();
		
		edad=(int)Duration.between(cal.toInstant(), today.toInstant()).toDays()/365;
		
	}


	public String getNombre() {
		return nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public Date getFechaNac() {
		return fechaNac;
	}
	
	public int getEdad() {
		return edad;
	}


	@Override
	public String toString() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyy");
		return "NBA [nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNac=" + formatter.format(fechaNac) + ", edad=" + edad + "]";
	}
	
	
	

	
}
