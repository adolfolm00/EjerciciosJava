package Práctica1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ejercicio07 {
	static int cont;
	static int id;

	

	static void mainEj7() {
		Scanner sc= new Scanner(System.in);
		float importe = 0;
		do {//bucle que no parará hasta que el identificador no esté repetido
			System.out.println("Escriba el identificador de la chuchería");
			id=sc.nextInt();
			
			comprobarID();
			}
			while(cont==1);
		System.out.println("Escribe el importe");
		importe=sc.nextFloat();
		
		Modificar(importe);
		Utilidades.leer(id);
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
	
	private static void Modificar(Float importe) {
		try {
			RandomAccessFile ra= new RandomAccessFile("quiosco.dat", "rw");
			//comprobamos el primer id
			id=id-1;
			System.out.println("Modificación realizada");
			ra.seek((id*Utilidades.tamRegistro)+48);
			ra.writeFloat(importe);
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
