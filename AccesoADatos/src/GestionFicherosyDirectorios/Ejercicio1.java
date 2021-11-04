package GestionFicherosyDirectorios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		File ficheroEscritura = new File("ficheroEscritura.txt");
		
		try {
			FileReader fr= new FileReader(ficheroEscritura);
			BufferedReader bf= new BufferedReader(fr);
			
			System.out.println("Nombre del fichero: "+ficheroEscritura.getName());
			System.out.println("La longitud del fichero es :"+ficheroEscritura.length());
			System.out.println("La ruta absoluta del fichero es:"+ficheroEscritura.getAbsolutePath());
			System.out.printf("Los datos del fichero son: Nombre: %s, Path: %s, Tamaño : %s",
					ficheroEscritura.getName(),
					ficheroEscritura.getAbsoluteFile(),
					ficheroEscritura.length());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
