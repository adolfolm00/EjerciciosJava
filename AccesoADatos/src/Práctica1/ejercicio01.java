package Práctica1;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio01 {
static int cont=0;
static int contclose=0;
	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("listadatos.txt");
			BufferedWriter bw= new BufferedWriter(fw);
		
		
		// TODO Auto-generated method stub
		String palabra;
		Scanner sc=new Scanner(System.in);
		
		do {
			palabra=sc.nextLine();
			
			
			if(palabra.equalsIgnoreCase("exit")) {
				cont++;	
			}
			escribir(reemplazar(palabra),fw,bw);
			
		}
		while(cont<=0);
		bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void escribir(String palabra,FileWriter fw, BufferedWriter bw) {
		try {
			
			
			bw.write(palabra);
			bw.newLine();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static String reemplazar(String palabra) {
		if(palabra.equalsIgnoreCase("exit")) {
			palabra="";
		}
		palabra=palabra.replace('a', '.');
		palabra=palabra.replace('e', '.');
		palabra=palabra.replace('i', '.');
		palabra=palabra.replace('o', '.');
		palabra=palabra.replace('u', '.');
		
		return palabra;
	}

}
