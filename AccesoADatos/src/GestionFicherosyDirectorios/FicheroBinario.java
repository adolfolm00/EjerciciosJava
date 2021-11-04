package GestionFicherosyDirectorios;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FicheroBinario {

	public static void main(String[] args) {
		
		File ficheroBinario = new File("ficheroBinario.dat");
		try {
			ficheroBinario.createNewFile();
			FileOutputStream fOS= new FileOutputStream(ficheroBinario);
			DataOutputStream dOS = new DataOutputStream(fOS);
			
			RandomAccessFile random = new RandomAccessFile("ficheroBinario.dat","rw");
			
			
			
			String nombres[]= {"Juan","Inventado"};
			Integer edades[]= {13,87};
			//escritura ficherobinario
			for(int i=0; i<nombres.length;i++) {
				dOS.writeUTF(nombres[i]);
				dOS.writeInt(edades[i]);
			}
			
			//lectura random fichero binario
			for(int i=0;i<nombres.length;i++) {
				System.out.println("Nombre: "+random.readUTF());
				System.out.println("Edad : "+random.readInt());
			}
			
			random.seek(0);
			System.out.println(random.readUTF());
			
			dOS.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
