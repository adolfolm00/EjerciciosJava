package Práctica1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			FileReader fr = new FileReader("quijote.txt");
			BufferedReader br = new BufferedReader(fr);
			String linea;
			int tamanio=0;
		
			while((linea=br.readLine())!=null) {
				System.out.println(linea);
				
				StringTokenizer st = new StringTokenizer(linea);
				tamanio=tamanio+st.countTokens();
				
			}
			
			
			br.close();
			System.out.println();
			System.out.println("Total palabras= "+ tamanio);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
