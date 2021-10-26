package examen;

import java.util.Scanner;

public class Alumnos {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String nombre;
		int nota1trim=0,nota2trim,nota3trim;
		
		//hacemos el array de alumnos
		Alumno a[]=new Alumno[22];
		
		
		//for con los nombres de cada alumno y las notas aleatorias
		for(int i=0;i<22;i++) {
			System.out.println("Escribe el nombre del alumno "+(i+1));
			nombre=sc.nextLine();
			nota1trim=(int)(Math.random()*10);
			nota2trim=(int)(Math.random()*10);
			nota3trim=(int)(Math.random()*10);
			
			a[i]=new Alumno(nombre,nota1trim,nota2trim,nota3trim);
		}
		
	
		
		//sacamos por pantalla todos los datos y notas de los alumnos
		for(int i=0;i<22;i++) {
			System.out.println(a[i].toString());
		}
		
		
		
		System.out.println();
		//mostramos por pantalla las medias de todos los alumnos en cada trimestre
		for(int i=0;i<1;i++) {
	
			System.out.println("Media 1 trimestre: " +a[i].getMedia1trim());
			System.out.println("Media 2 trimestre: "+a[i].getMedia2trim());
			System.out.println("Media 3 trimestre: "+a[i].getMedia3trim());
		}
		
		
		sc.close();
		
		

	}

}
