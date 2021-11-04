import java.io.File;

public class Ej01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ruta1="/Users/adolfo/Documents/Acceso/Dir1";
		String ruta2="//Users/adolfo/Documents/Acceso/Dir2";
		String ruta3="/Users/adolfo/Documents/Acceso/Dir3";
		String rutaficheros="/Users/adolfo/Documents/Acceso/Fich1";
		
		File dir1 = new File(ruta1);
		File dir2 = new File(ruta2);
		File dir3 = new File(ruta3);
		
		File fich1= new File(rutaficheros);
		
		//DIR 1
		if(dir1.exists()) {
			System.out.println("Dir 1 existe");
			if(fich1.exists()) {
				System.out.println("Ficheros creados");
			}
			else {
				
			}
		}
		
		
		else{
			dir1.mkdir();
			System.out.println("Creado dir 1");
		}
		
		 //DIR 2
		if(dir2.exists()) {
				System.out.println("Dir 2 existe");
			}
			 else {
				 dir2.mkdir();
				 System.out.println("Creador dir 2");
			 }
		 
		 
		//DIR 3
		if(dir3.exists()) {
				System.out.println("Dir 3 existe");
			}
		 else {
			 dir3.mkdir();
			 System.out.println("Creado dir 3");
		 }
	
	}

}
