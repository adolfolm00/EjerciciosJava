package AgendaContactos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static ArrayList<Contacto>contactos=new ArrayList<Contacto>();
	static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {
		
		int menu=0;
		int usuario=0;
		
		do {
			if(contactos.size()==0) {
				System.out.println("\n Pulse 1 para añadir contactos \n Pulse 5 para salir");
				usuario=sc.nextInt();
				
				switch(usuario) {
				case 1: AnadirContactos();
					break;
					
				case 5: System.exit(0);
					break;
					
				default: System.out.println("Se ha equivocado de número");
					break;
				}
				
			}else if(contactos.size()>0) {
				System.out.println("\n Pulse 1 para añadir contactos \n Pulse 2 para ver los contactos \n Pulse 3 para eliminar contactos \n Pulse 4 para ordenar contactos \n Pulse 5 para salir");
				usuario=sc.nextInt();
				
				switch(usuario) {
				case 1: AnadirContactos();
					break;
					
				case 2: VerContactos();
					break;
				
				case 3: EliminarContactos();
					break;
					
				case 5: System.exit(0);
					break;
					
				default: System.out.println("Se ha equivocado de número");
					break;
				}
			}
			
			
			
		}
		while(menu==0);

	}
	
	private static void AnadirContactos() {
		System.out.println("Ha seleccionado añadir contactos");
		System.out.println("Escriba el nombre del contacto");
		String nombre=sc.next();
		int cont = 0;
		
		do {
			System.out.println("Escriba el email del contacto(debe incluir un @)");
			String email=sc.next();
			for(int i=0;i<email.length();i++) {
				if(email.charAt(i)=='@') {
					cont++;
				}
			}
		}
		while(cont==0);
		
		System.out.println("Escriba el número del contacto");
		int num=sc.nextInt();
		contactos.add(new Contacto(nombre, nombre, num));
		System.out.println("Contacto añadido");
		
		
	}
	
	private static void VerContactos() {
		System.out.println("Ha seleccionado ver contactos");
		for(Contacto c:contactos) {
			System.out.println(c.toString());
		}
	}
	
	private static void EliminarContactos() {
		System.out.println("Ha seleccionado eliminar contactos");
		System.out.println("Escriba el número de la persona que quiere eliminar");
		int num=sc.nextInt();
		for(int i=0;i<=contactos.size();i++) {
			if(contactos.get(i).getNumtlf()==num) {
				contactos.remove(i);
			}
		}
		System.out.println("Contacto eliminado");
	}

}
