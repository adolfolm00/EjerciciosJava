import java.io.File;

public class ManejoFicheros {

	public static void main(String[] args) {
		
		
		String ruta= "dir";
		File directorio1= new File("dir");
		
		if(directorio1.exists() && directorio1.isDirectory()) {
			System.out.println("Ok, ya se ha creado");
		}else {
			directorio1.mkdir();
			System.out.println("Directorio creado");
		}

	}

}
