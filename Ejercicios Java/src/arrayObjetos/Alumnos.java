package arrayObjetos;

import java.util.Scanner;

public class Alumnos {

	public static void main(String[] args) {
		
		
       
        
         Scanner leer= new Scanner(System.in);
         int edad,curso,numero;
         String nombre;
         
         
         System.out.println("¿Cuántos alumnos hay");
         numero=leer.nextInt();
         leer.nextLine();
         
         Alumno a[] = new Alumno [numero];
         
         for(int i=0;i<a.length;i++) {
        	 System.out.println("Dame el nombre del alumno");
        	nombre=leer.nextLine();
        	
        	System.out.println("Dame el curso del alumno");
        	curso=leer.nextInt();
        	
        	System.out.println("Dame la edad del alumno");
        	edad=leer.nextInt();
        	leer.nextLine();
        	
        	a[i]=new Alumno (nombre,curso,edad);
        	
        	System.out.println("-------------");
         }
         
         for(int i=0;i<a.length;i++) {
        	System.out.println(a[i].toString());
         }
         
         leer.close();
         
         


	}

}
