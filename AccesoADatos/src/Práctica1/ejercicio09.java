package Práctica1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ejercicio09 {
static boolean borrado;
	

	static void mainEj9() {
		for(int i = 0;i<Utilidades.numRegistros();i++) {
			leerBorrados(i);
			if(leerBorrados(i)==-1) {
				Utilidades.leer(i);
			}
		}
	}
	
	static int leerBorrados(int id) {
		int num=0;
		try {
			RandomAccessFile ra = new RandomAccessFile("quiosco.dat", "r");
			ra.seek(id*Utilidades.tamRegistro);
			num=ra.readInt();
			if(num==-1) {
				borrado=true;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
		
		
		
		
		
	}

}
