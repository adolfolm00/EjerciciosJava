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

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class TratamientoFicherosXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			DocumentBuilderFactory dfb = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dfb.newDocumentBuilder();
			Document doc = db.newDocument();
			
			//Crear la raíz del documento XML
			
			Element eRaiz = doc.createElement("Producto");
			doc.appendChild(eRaiz);
			
			//Añadimos más nodos de nuestro producto
			Element eNombre = doc.createElement("nombre");
			eRaiz.appendChild(eNombre);
			
			Attr atributo = doc.createAttribute("id");
			atributo.setValue("Coche");
			eNombre.setAttributeNode(atributo);
			eNombre.appendChild(doc.createTextNode("Renault"));
			
			
			Element eDireccion = doc.createElement("Direccion");
			Element calle = doc.createElement("calle");
			Element numero = doc.createElement("calle");
			Element letra = doc.createElement("calle");
			eDireccion.appendChild(calle);
			eDireccion.appendChild(numero);
			eDireccion.appendChild(letra);
			
			eRaiz.appendChild(eDireccion);
			
			//Finalizar la creación del xml
			TransformerFactory tff = TransformerFactory.newInstance();
			Transformer tf = tff.newTransformer();
			DOMSource source = new DOMSource(doc);
			
			StreamResult sR = new StreamResult(new File("ejemploxml.xml"));
			
			tf.transform(source, sR);
					
		} catch (ParserConfigurationException | TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
