package GestionFicherosyDirectorios;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class AccesoRandomOk {

	public static void main(String[] args) {
		
		
		
		try {
			String ficherobinario= "ficherobinario1.dat";
			RandomAccessFile random = new RandomAccessFile(ficherobinario,"rw");
			FileOutputStream fOS= new FileOutputStream(ficherobinario);
			DataOutputStream dOS = new DataOutputStream(fOS);
			
			String nombres[]= {"Juan","Pepe","Papa","Pepa"};
			int num[]= {1,2,3,4};
			
			for(int i=0;i<nombres.length;i++) {
				dOS.writeChars(nombres[i]);
				dOS.writeInt(num[i]);
			}
			
			for(int i=0;i<nombres.length;i++) {
				System.out.println("Nombre: "+random.readChar());
				System.out.println("Edad: "+random.readInt());
			}
			
			
			System.out.println(random.readUTF());
			
			for(int i=0;i<random.length();i=i+12) {
				random.seek(i);
				
				String nombre="";
				
				for(int j=0;j<4;j++) {
					nombre+= random.readChar();
				}
				
				System.out.println(nombre);
				System.out.println(random.readInt());
			}
			
			
			
			dOS.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
