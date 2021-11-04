package Práctica1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Main {
	static ArrayList<Chucheria>chucherias= new ArrayList<Chucheria>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu=0;
		int user=0;
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("\n MENÚ \n \n Pulsa 3 para realizar el ejercicio 3 \n Pulsa 4 para realizar el ejercicio 4\n Pulsa 5 para realizar el ejercicio 5 \n Pulsa 6 para realizar el ejercicio 6 \n Pulsa 7 para realizar el ejercicio 7 \n Pulsa 8 para realizar el ejercicio 8 \n Pulsa 9 para realizar el ejercicio 9 \n Pulsa 10 para realizar el ejercicio 10 \n Pulsa 11 para salir");
			user=sc.nextInt();
			
			switch(user) {
			case 3: System.out.println("Has seleccionado ejercicio 3");
					System.out.println();
				ejercicio3();
				break;
				
			case 4: System.out.println("Has seleccionado ejercicio 4");
					System.out.println();
				ejercicio4();
				break;
			
			case 5: System.out.println("Has seleccionado ejercicio 5");
				ejercicio5();
				break;
				
			case 6: System.out.println("Has seleccionado ejercicio 6");
					System.out.println();
				ejercicio6();
				break;
				
			case 7: System.out.println("Has seleccionado ejercicio 7");
			System.out.println();
			ejercicio7();
			break;
			
			case 8: System.out.println("Has seleccionado ejercicio 8");
			System.out.println();
			ejercicio8();
				break;
			
			case 9: System.out.println("Has seleccionado ejercicio 9");
			System.out.println();
			ejercicio9();
				break;
			
			case 10:  System.out.println("Has seleccionado ejercicio 10");
			System.out.println();
			ejercicio10();
				break;
			
			
			
			case 11: System.exit(0);
				break;
				
			default: System.out.println("Tecla incorrecta");
				break;
			}
			
		}
		while(menu==0);

		
	
		
		
		
		
	}
	
	private static void ejercicio3() {
		chucherias.add(new Chucheria(3, "Chicles             ", 3.2f));
		chucherias.add(new Chucheria(2, "Gusanitos           ", 18.5f));
		chucherias.add(new Chucheria(3, "Gominola            ", 2.5f));
		chucherias.add(new Chucheria(8, "Pipas               ", 15.17f));
		chucherias.add(new Chucheria(1, "Piruletas           ", 12.40f));
		
		
		Ejercicio03.escribir(chucherias);
		
		
		
	}
	
	private static void ejercicio4() {
		ejercicio04.leer();
	}
	
	private static void ejercicio5() {
		ejercicio05.mainEj5();
	}

	private static void ejercicio6() {
		ejercicio06.mainEj6();
	}
	
	private static void ejercicio7() {
		ejercicio07.mainEj7();
	}
	
	private static void ejercicio8() {
		ejercicio08.mainEj8();
	}
	
	private static void ejercicio9() {
		ejercicio09.mainEj9();
	}
	
	private static void ejercicio10() {
		for(Chucheria c: chucherias) {
			crearXML(c,"Chucheria-ID.xml");
		}
	}
	
	

	
	
	static void anadirChuche( int estanteria, String tipo, float preciosin) {
		chucherias.add(new Chucheria(estanteria,tipo,preciosin));
	}
	
	static void leerChuche() {
		for(Chucheria c: chucherias) {
			System.out.println(c.toString());
		}
	}
	
	 static void crearXML(Chucheria chucheria, String nombreFichero) {
		
		try {
			DocumentBuilderFactory dBF= DocumentBuilderFactory.newInstance();
			DocumentBuilder dB = dBF.newDocumentBuilder();
			Document d = dB.newDocument();
			
			//Creamos el elemento Raiz
			Element raiz = d.createElement("PRODUCTO");
			d.appendChild(raiz);
			
			//Nodos
			Element id = d.createElement("ID");
			Element estanteria = d.createElement("ESTANTERIA");
			Element tipo = d.createElement("TIPO");
			Element precio = d.createElement("PRECIO");
			
			raiz.appendChild(id);
			raiz.appendChild(estanteria);
			raiz.appendChild(tipo);
			raiz.appendChild(precio);
			
			
			id.appendChild(d.createTextNode(String.valueOf(chucheria.getId())));
			id.appendChild(d.createTextNode(String.valueOf(chucheria.getEstanteria())));
			tipo.appendChild(d.createTextNode(String.valueOf(chucheria.getTipochucheria())));
			precio.appendChild(d.createTextNode(String.valueOf(chucheria.getPreciosiniva())));
	
			
			
			//Creamos fichero
			TransformerFactory tFF = TransformerFactory.newInstance();
			Transformer tf = tFF.newTransformer();
			
			DOMSource source = new DOMSource(d);
			
			StreamResult result = new StreamResult(new File(nombreFichero));
			
			tf.transform(source, result);
			
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	static int tam() {
		return chucherias.size();
	}
	
	static void leer() {
		try {
			
			RandomAccessFile ra=new RandomAccessFile("quiosco.dat", "r");
			StringBuilder chuche=new StringBuilder();
			ra.seek(1*Utilidades.tamRegistro);
			chuche.append("ID: "+ra.readInt());
			chuche.append("Estantería: "+ra.readInt());
			
			String nombre="";
			for(int i = 0;i<20;i++) {
				nombre+=ra.readChar();
			}
			chuche.append("Nombre: "+nombre);
			chuche.append("Precio sin IVA: "+ra.readFloat());
			
			System.out.println(chuche.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

}
