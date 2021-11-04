package ficheroXML;

import java.io.File;

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

import ClaseSerializablee.Producto3;

public class ProductoSerializableXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto3 p1= new Producto3("Moto",2,2,2) ;
		Producto3 p2= new Producto3("Coche",2,2,2);
		
		
		crearXML(p1,"nombrefichero1.xml");
		crearXML(p2,"nombrefichero1.xml");
		
		
		
	}
	
	private static void crearXML(Producto3 producto, String nombreFichero) {
		
		try {
			DocumentBuilderFactory dBF= DocumentBuilderFactory.newInstance();
			DocumentBuilder dB = dBF.newDocumentBuilder();
			Document d = dB.newDocument();
			
			//Creamos el elemento Raiz
			Element raiz = d.createElement("PRODUCTO");
			d.appendChild(raiz);
			
			//Nodos
			Element tipo = d.createElement("TIPO");
			Element id = d.createElement("ID");
			Element stock = d.createElement("STOCK");
			Element precio = d.createElement("PRECIO");
			
			raiz.appendChild(tipo);
			raiz.appendChild(id);
			raiz.appendChild(stock);
			raiz.appendChild(precio);
			
			
			tipo.appendChild(d.createTextNode(producto.getNombre()));
			id.appendChild(d.createTextNode(String.valueOf(producto.getCodigo())));
			stock.appendChild(d.createTextNode(String.valueOf(producto.getStock())));
			precio.appendChild(d.createTextNode(String.valueOf(producto.getPrecio())));
			
			
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

}
