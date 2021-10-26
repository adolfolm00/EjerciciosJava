package arrayObjetos;

import java.util.Scanner;

public class Personas {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Persona p[]= new Persona[2];
		String nombreObjeto;
		int edadObjeto;
		char sexoObjeto;
		double pesoObjeto;
		double alturaObjeto;
		
		for(int i=0;i<p.length;i++) {
			System.out.println("Dígame el nombre de la persona "+ (i+1));
			nombreObjeto= sc.nextLine();
			System.out.println("Dígame la edad de la persona "+ (i+1));
			edadObjeto= sc.nextInt();
			//Buffer
			sc.nextLine();
			System.out.println("Dígame el sexo de la persona "+ (i+1));
			sexoObjeto=sc.next().charAt(0);
			System.out.println("Dígame el peso de la persona "+ (i+1));
			pesoObjeto=sc.nextDouble();
			System.out.println("Dígame la altura de la persona "+ (i+1));
			alturaObjeto=sc.nextDouble();
			
			sc.nextLine();
			
			p[i]=new Persona(nombreObjeto, edadObjeto, sexoObjeto, pesoObjeto, alturaObjeto);
			
			
			System.out.println("----------------");
		}
		
		
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i].toString());
			System.out.println(p[i]);
			System.out.println(p[i].getAltura());
			System.out.println(p[i].getPeso());
			System.out.println(p[i].esMayorDeEdad(p[i].getEdad()));
			System.out.println("--------------");
		}
		
		sc.close();

	}

}
