package Práctica1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ejercicio05 {
	
	static Scanner sc= new Scanner(System.in);
	static int id;
	static int cont=0;

	

	static void mainEj5() {
		do {//bucle que no parará hasta que el identificador no esté repetido
			System.out.println("Escriba el identificador de la chuchería");
			id=sc.nextInt();
			comprobarID();
			}
			while(cont==1);
			
			Utilidades.leer(id-1);
	}
	
	
			
		
			
			
	
	private static void buscarChuche(int id) {
		try {
			RandomAccessFile ra= new RandomAccessFile("quiosco.dat", "r");
			ra.seek(id*Utilidades.tamRegistro);
			Utilidades.leer(id);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	
	

}
