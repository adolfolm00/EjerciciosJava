package GestionFicherosyDirectorios;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class AccesoRandomBinario {

	public static void main(String[] args) {
		
		
		
		try {
			RandomAccessFile raf= new RandomAccessFile("ficheroOk.dat","rw");
			
			String nombres[]= {"pepe   ","juan   ","luis   ","rodolfo"};//2 * 7 = 14 bytes.
			int edades[]= {1111,11,24444,34};
			
			for(int i=0;i<nombres.length;i++) {
				raf.writeChars(nombres[i]);
				raf.writeInt(edades[i]);
			}
			
			raf.close();
			
			RandomAccessFile rafLectura= new RandomAccessFile("ficheroOk.dat","r");
			rafLectura.seek(36);
			
			String nombre="";
			
			for(int j=0; j<nombres[0].length();j++) {
				nombre+= rafLectura.readChar();//nombre=nombre+rafLectura.readChar();
			}
			System.out.println(nombre);
			System.out.println(rafLectura.readInt());
			
			System.out.println(rafLectura.readUTF());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch (IOException e1){
			
		}

	}

}
