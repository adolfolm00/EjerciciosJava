package Práctica1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Utilidades {
	public static StringBuilder idNoBorrados;
	public static Integer tamRegistro = 52;
	
	static void leer(int id) {
		try {
			
			//4+4+40+4=52
			
			RandomAccessFile ra = new RandomAccessFile("quiosco.dat", "r");
			StringBuilder chuche=new StringBuilder();
			ra.seek(id*Utilidades.tamRegistro);
			
			chuche.append(" ID: "+ra.readInt());
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
	
	static void leerRegistros(int i) {
try {
			
			//4+4+40+4=52
				
			RandomAccessFile ra = new RandomAccessFile("quiosco.dat", "r");
			StringBuilder chuche=new StringBuilder();
			ra.seek(i*Utilidades.tamRegistro);
			chuche.append("ID: "+ra.readInt());
			chuche.append(" Estantería: "+ra.readInt());
			
			
			String nombre="";
			for(int f = 0;f<20;f++) {//leer nombres
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
	
	static int numRegistros() {
		int tamanio = 0;
		try {
			
			RandomAccessFile ra = new RandomAccessFile("quiosco.dat", "r");
			tamanio=(int) (ra.length()/Utilidades.tamRegistro);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tamanio;
		
	}
	
	static void escribir(int id, int estanteria, String tipo, float precio) {
		try {
			
			RandomAccessFile ra = new RandomAccessFile("quiosco.dat", "rw");
			
			ra.seek((id-1)*Utilidades.tamRegistro);
			ra.writeInt(id);
			ra.writeInt(estanteria);
			
			StringBuffer sb=new StringBuffer(tipo);
			sb.setLength(20);
			
			ra.writeChars(sb.toString());
			ra.writeFloat(precio);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
