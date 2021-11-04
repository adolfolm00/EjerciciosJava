package ClaseSerializablee;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto2 p1=new Producto2("Coche", 200, 1, 20, 20000);
		Producto2 p2=new Producto2("Moto", 200, 1, 20, 20000);
		
		
		
		try {
			FileOutputStream escribirfichero;
			File ficheroSerializable= new File("FicheroProducto2.dat");
			escribirfichero= new FileOutputStream(ficheroSerializable);
			ObjectOutputStream funcionEscribir = new ObjectOutputStream(escribirfichero);
			
			funcionEscribir.writeObject(p1);
			funcionEscribir.writeObject(p2);
			
			funcionEscribir.close();
			
			FileInputStream leerFichero= new FileInputStream(ficheroSerializable);
			ObjectInputStream leerEscribir = new ObjectInputStream(leerFichero);
			
			
			System.out.println(leerEscribir.readObject().toString());
			System.out.println(leerEscribir.readObject().toString());
			leerEscribir.close();
			
			
		} catch (IOException  | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
