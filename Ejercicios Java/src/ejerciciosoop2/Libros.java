package ejerciciosoop2;

import java.util.Scanner;

public class Libros {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String titulo,autor;
		int cantidad;
		
		System.out.println("¿Cuántos libros quieres añadir?");
		int cantlibros=sc.nextInt();
		
		

		
		Libro l[]=new Libro[cantlibros];
		sc.nextLine();
		
		for(int i=0;i<l.length;i++) {
			System.out.println("Escribe el nombre del título del libro "+(i+1));
			titulo=sc.nextLine();
			System.out.println("Escribe el nombre del autor del libro "+(i+1));
			autor=sc.nextLine();
			System.out.println("Escribe la cantidad de libros a añadir para el libro "+(i+1));
			cantidad=sc.nextInt();
			
			l[i]=new Libro(titulo,autor,cantidad);
			sc.nextLine();
		}
		
		
		
		int id;
		int volver;
		
		
		System.out.println("Estos son los libros que tenemos");
		for(int i=0;i<l.length;i++) {
			System.out.println(l[i].menulibros());
		}
		int cliente;
		do {
		System.out.println("1. Para comprar o alquilar");
		System.out.println("2. Para devolver ");
		System.out.println("3. Para consultar la disponibilidad de los libros");
		System.out.println("4. Para volver al menú");
		System.out.println("5. Para salir");
		cliente=sc.nextInt();
		
		switch(cliente) {
		case 1: System.out.println("Escriba el identificador del libro que desea");
		id=sc.nextInt();
		for(int i=0;i<l.length;i++) {
			l[id-1].Prestamo();
			
		}
		System.out.println("Si quiere volver a comprar pulse 1, para volver al menú 4, salir 5");
		cliente=sc.nextInt();
		break;
		case 2: System.out.println("Escriba el identificador del libro que desea");
		id=sc.nextInt();
		for(int i=0;i<l.length;i++) {
			if(i==id) {
				l[i].Devolucion();
			}
			
		}
		System.out.println("Si quiere volver a devolver pulse 2, para volver al menú 4, salir 5");
		cliente=sc.nextInt();
		break;
		
		case 3: 
			for(int i=0;i<l.length;i++) {
				System.out.println(l[i].disponibilidad());
			}
		System.out.println("Para volver al menú pulse 4");
		cliente=sc.nextInt();
		break;
		
		case 5: System.exit(0);
		}
		
	
		}
		while(cliente==4);
		
		for(int i=0;i<l.length;i++) {
			System.out.println(l[i].toString());
		}
		
		
		
		
		sc.close();

	}

}
