package Ficheros;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ManejoFicheros {
	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		
		
		//ejercicio1();

		
		//ejercicio2();
		
		//ejercicio3();
		
		File ficheroEscritura = new File("ficheroEscritura.txt");
		String textoEscritura ="Hola mundo";
		Boolean escritura = Boolean.TRUE;
		
		escrituraFichero(ficheroEscritura, textoEscritura, escritura);
		
		try {
			FileReader fr= new FileReader(ficheroEscritura);
			BufferedReader bf= new BufferedReader(fr);
			
			String linea;
			
			while((linea = bf.readLine())!=null) {
				System.out.println(linea);
				
			}
			bf.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void escrituraFichero(File ficheroEscritura, String texto, Boolean sobreescritura) {
		try {
			
			
			ficheroEscritura.createNewFile();
		
			FileWriter fw = new FileWriter(ficheroEscritura,sobreescritura);
			
			BufferedWriter br = new BufferedWriter(fw);
			
			
			br.write(texto);
			br.newLine();
			
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void ejercicio3() {
		for(int i=1;i<=3;i++) {
		File directorioI = new File("dir"+i);
		comprobacionYCreacionDirectorio(directorioI);
		for(int j=1;j<=3;j++) {
			File ficheroJ= new File("dir"+i+"/fich"+j);
			comprobacionYCreacionFichero(ficheroJ);
			
			
			Random random= new Random(10L);
			escrituraFichero(ficheroJ,"hola Mundo",Boolean.TRUE);
			
		}
		}
	}

	private static void ejercicio2() {
		File fichero1 = new File("dir/fichero1");
		
		comprobacionYCreacionFichero(fichero1);
	}

	private static void comprobacionYCreacionFichero(File fich) {
		if(fich.exists() && fich.isFile()) {
			System.out.println("Ok, ya se ha creado el fichero");
		}else {
			try {
				fich.createNewFile();
			} catch (IOException e) {
				System.out.println(e.toString());
				e.printStackTrace();
			}
			System.out.println("Fichero creado");
		}
	}

	private static void ejercicio1() {
		//String ruta= "dir";
		File directorio1= new File("dir");
		
		comprobacionYCreacionDirectorio(directorio1);
	}

	private static void comprobacionYCreacionDirectorio(File dir) {
		if(dir.exists() && dir.isDirectory()) {
			System.out.println("Ok, ya estaba creado");
		}else {
			dir.mkdir();
			System.out.println("Directorio creado");
		}
	}

}
