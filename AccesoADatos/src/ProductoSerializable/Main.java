package ProductoSerializable;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	
	static ArrayList <Producto>productos=new ArrayList<Producto>();

	public static void main(String[] args) {
		
		
		
		productos.add(new Producto("Cartón de Leche", 100, 10, 2.f));
		productos.add(new Producto("Caja de cereales", 80, 3, 1.f));
		
		for(Producto p:productos) {
			AnadirProductoFichero(p.toString());
		}
		LeerProductoFichero();
	}
	
	private static void AnadirProductoFichero(String s) {
		
		
		
		File ficheroEscritura = new File("productos.txt");
		
		try {
			ficheroEscritura.createNewFile();
			FileWriter fw = new FileWriter(ficheroEscritura);
			BufferedWriter br = new BufferedWriter(fw);
			
			for(Producto p:productos) {
				br.write(p.toString());
				br.newLine();
			}
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void LeerProductoFichero() {
		FileReader fw;
		try {
			fw = new FileReader("productos.txt");
			BufferedReader br = new BufferedReader(fw);
			
			for(Producto p: productos) {
				System.out.println(br.readLine());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
