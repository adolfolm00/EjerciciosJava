package Práctica1;

import java.io.IOException;
import java.io.RandomAccessFile;

public class ejercicio04 {


	static void leer() {
		
		for(int i = 0;i<Utilidades.numRegistros();i++) {
			Utilidades.leerRegistros(i);
		}

		
	}

	
	

}
