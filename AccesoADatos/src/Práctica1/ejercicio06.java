package Práctica1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio06 {

	static int id;
	static Integer cont=0;
	static int ultid;
	static Scanner sc=new Scanner(System.in);
	static float preciosiniva;
	static boolean repetir;
	
	
	
	

	public static void mainEj6() {
		
		do {//bucle que no parará hasta que el identificador no esté repetido
		System.out.println("Escriba el identificador de la chuchería");
		id=sc.nextInt();
		comprobarID();
		}
		while(cont==1);
		
		if(cont==0) {
			
			System.out.println("Escribe la estantería de la chuchería");
			int estanteria= sc.nextInt();
			
			String tipo;
			do {//bucle que en caso de que el string tipo valga más de 20 chars, no parará
			System.out.println("Escriba el tipo de chuchería");
			 tipo=sc.next();
			}
			while(tipo.length()>20);
			
			sc.nextLine();
			
			
			System.out.println("Escribe el precio sin IVA de la chuchería");
			 float preciosiniva=sc.nextFloat();
			
			
			
			
			do {
				tipo+=" ";
			
			}while(tipo.length()<20);
			
			//Utilidades.escribir(id, estanteria, tipo, preciosiniva);
			escribirChuche(id, estanteria, tipo, preciosiniva);
			Main.anadirChuche(estanteria, tipo, preciosiniva);
			leerChuche();
			//Utilidades.leer(id-1);
			}
		}
	
	
	private static void comprobarID() {
		try {
			RandomAccessFile ra= new RandomAccessFile("quiosco.dat", "r");
		
			
		
		
		
			if(Utilidades.numRegistros()>=id) {
				cont=1;
			}else if(Utilidades.numRegistros()<=id){
				cont=0;
				
				
			}
			
		/**	ra.seek(52*(id-1));
		//	if(ra.readInt()==id) {
				cont++;
			}
			else if(ra.readInt()!=id) {
				cont=0;
			}*/
			
			
			
			
			
			
			
			
			/**if(cont>0) {
				
				System.out.println();
			}*/
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}


	
	public static void escribirChuche(int id,int estanteria, String tipo,float preciosiniva) {
		
		try {
			RandomAccessFile ra= new RandomAccessFile("quiosco.dat", "rw");
			
			
			ra.seek((Utilidades.numRegistros())*Utilidades.tamRegistro);
			ra.writeInt(Utilidades.numRegistros()+1);
			ra.writeInt(estanteria);
			
			StringBuffer sb=new StringBuffer(tipo);
			sb.setLength(20);
			
			ra.writeChars(tipo);
			ra.writeFloat(preciosiniva);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
public static void leerChuche() {
		
	try {
		
		//4+4+40+4=52
		
		RandomAccessFile ra = new RandomAccessFile("quiosco.dat", "r");
		StringBuilder chuche=new StringBuilder();
		ra.seek((Utilidades.numRegistros()-1)*Utilidades.tamRegistro);
		chuche.append("ID: "+ra.readInt());
		chuche.append(" Estantería: "+ra.readInt());
		
		
		String nombre="";
		for(int i = 0;i<20;i++) {//leer nombres
			nombre+=ra.readChar();
		}
		
		chuche.append(" Tipo Chuchería: "+nombre);
		chuche.append(" Precio sin iva: "+ra.readFloat());
		
		System.out.println(chuche.toString());
		
		
		
		
		
		
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
}
	
	
	/**private static void leerChuche(int tam) {
		//leemos la cuche para ver que está correctamente
		//nos colocamos en la posición 6
		try {
			RandomAccessFile ra=new RandomAccessFile("quiosco.dat", "r");
			StringBuilder chuche=new StringBuilder();
			ra.seek(id*Utilidades.tamRegistro);
			chuche.append("ID: "+ra.readInt());
			chuche.append("Estantería: "+ra.readInt());
			
			String nombre="";
			for(int i = 0;i<20;i++) {
				nombre+=ra.readChar();
			}
			chuche.append("Nombre: "+nombre);
			chuche.append("Precio sin IVA: "+ra.readFloat());
			
			System.out.println(chuche.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}*/
