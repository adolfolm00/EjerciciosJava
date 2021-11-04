package Práctica1;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Ejercicio03 {



	public static void escribir(ArrayList<Chucheria> chucherias) {
		try {
			RandomAccessFile ra= new RandomAccessFile("quiosco.dat", "rw");
			
			for(Chucheria c: chucherias) {
				ra.writeInt(c.getId());
				ra.writeInt(c.getEstanteria());
				
				StringBuffer sb=new StringBuffer(c.getTipochucheria());
				sb.setLength(20);
				
				ra.writeChars(sb.toString());
				ra.writeFloat(c.getPreciosiniva());
				
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
