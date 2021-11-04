package Práctica1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ejercicio08 {
	
	static Scanner sc= new Scanner(System.in);
	static int id;
	static int cont=0;
	


	static void mainEj8() {
		do {//bucle que no parará hasta que el identificador no esté repetido
			System.out.println("Escriba el identificador de la chuchería");
			id=sc.nextInt();
			comprobarID();
			}
			while(cont==1);
		eliminarChuche(id-1);
	}
	
	
	private static void comprobarID() {
		try {
			RandomAccessFile ra= new RandomAccessFile("quiosco.dat", "r");
			//comprobamos el primer id
			
		
		
	
			if(Utilidades.numRegistros()>=id) {
				cont=0;
				
			}else if(Utilidades.numRegistros()<=id){
				cont=1;
				
			}
			
	
			

			
			
			
			
			
			if(cont>0) {
				
				System.out.println();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void eliminarChuche(int id) {
		try {
			RandomAccessFile ra= new RandomAccessFile("quiosco.dat", "rw");
			String vacio = "                   ";
			
			
			String largo = Integer.toString(id);
			String espacios = "";
			System.out.println(largo.length());
			
			ra.seek(id*Utilidades.tamRegistro);
			
			ra.writeInt(-1);
			ra.writeInt(0);
			
			StringBuffer sb=new StringBuffer(vacio);
			sb.setLength(20);
			
			ra.writeChars(id+vacio);
			ra.writeFloat(0);
			
			System.out.println("Chuche con ID "+(id+1)+" eliminada");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
