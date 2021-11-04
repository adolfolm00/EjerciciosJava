package GestionFicherosyDirectorios;

import java.io.File;

public class Ejercicioo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("./");
		ls(file);

	}
	
	private static void ls(File directorio) {
		File[] listaDirectorios = directorio.listFiles();
		
		for(int i = 0; i < listaDirectorios.length; i++) {
			File dondeEstoy = listaDirectorios[i];
			if(dondeEstoy.isFile()) {
				System.out.printf("Nombre = %s ", dondeEstoy.getName());
				
			}else {
				System.out.printf("Nombre = %s ", dondeEstoy.getName());
				ls(dondeEstoy);
			}
		}
	}

}
