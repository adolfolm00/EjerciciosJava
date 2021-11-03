package ExamenFinal;

import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Main {
		//Creación de arraylist
		static ArrayList<Articulo>articulos=new ArrayList<Articulo>();
		static String fraseproveedor="null";
		static String frasecliente="null";
		
	public static void main(String[] args) {
	
		UIManager UI=new UIManager();
		UI.put("OptionPane.background", new Color(0, 10, 0));
		UI.put("Panel.background", new Color(0, 10, 0));
		UI.put("OptionPane.messageForeground", Color.white);
		
		
		int usuario=0;
		int menu=0;
		
		//MENÚ
		do {
			usuario=Integer.parseInt((String) JOptionPane.showInputDialog( null, " \nIntroduzca 1 si desea comprobar los artículos(IVA YA INCLUIDO)\nIntroduzca 2 si desea vender a un cliente\nIntroduzca 3 si desea comprar a proveedor(IVA YA INCLUIDO)\nIntroduzca 4 si desea gestionar artículos\nIntroduzca 5 si ver las estadísticas\nIntroduzca 6 para utilizar la calculadora\nIntroduzca 7 si desea salir"));
			switch(usuario) {
			case 1:
				JOptionPane.showMessageDialog(null, "Ha seleccionado mostrar artículos");
				JOptionPane.showMessageDialog(null, "Información reflejada por consola");
				MostrarArticulos();
					break;
					
			case 2:
				JOptionPane.showMessageDialog(null, "Ha seleccionado vender artículos a cliente");
				VenderCliente();
				break;
				
			case 3:
				JOptionPane.showMessageDialog(null, "Ha seleccionado comprar artículos a provedor");
				ComprarProveedor();
				break;
				
			case 4:
				JOptionPane.showMessageDialog(null, "Ha seleccionado gestionar artículos");
				GestionarArticulos();
				break;
				
			case 5:
				JOptionPane.showMessageDialog(null, "Ha seleccionado ver las estadísticas");
				JOptionPane.showMessageDialog(null, "Información reflejada por consola");
				Estadisticas();
				break;
				
			case 6:
				JOptionPane.showMessageDialog(null, "Ha seleccionado usar la calculadora");
				Calculadora();
				break;
			case 7:
				System.exit(0);
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Opción incorrecta");
				break;
			}
		}while(menu==0);

	}
	
	//Creación de métodos para cada caso
	
	//Método para recorrer artículos y mostrarlos por consola
	public static void MostrarArticulos() {
		System.out.println("------------");
		System.out.println("Listado de productos");
		Collections.sort(articulos,new OrdenarID());
		for(Articulo a:articulos) {
			System.out.println(a.toString());
		}
	}
	//Método para Vender a un cliente
	public static void VenderCliente() {
		int cont=0;
		int idprod=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el ID del producto"));
		int stockprod=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad que desea de ese producto"));
		String nombrecliente=JOptionPane.showInputDialog("Introduzca su nombre");
		
		String confirmar=JOptionPane.showInputDialog( "Introducza S si desea confirmar la compra, sino pulse N");
		
		if(confirmar.equalsIgnoreCase("S")) {
		for(Articulo a: articulos) {
			if(idprod==a.getId()) {
				cont++;
				if(a.venderCliente(stockprod).equalsIgnoreCase("True")) {
					a.setNventas(stockprod);
					a.setStock(a.getStock()-stockprod);
					JOptionPane.showMessageDialog(null, "\nDatos de la compra\nNombre artículo: "+a.getNombre()+"\nPrecio total en euros: "+a.getPrecioventacliente()*stockprod+"\nCantidad de producto: "+stockprod+"\nNombre cliente: "+nombrecliente);
				}
				else if(a.venderCliente(stockprod).equalsIgnoreCase("False")) {
					JOptionPane.showMessageDialog(null, "Su compra no ha podido ser realizada, ha solicitado más producto del que queda");
				}
			}
		}
		if(cont==0) {
			JOptionPane.showMessageDialog(null, "No se ha encontrado ningún producto con esa ID");
	}
		}
		else if(confirmar.equalsIgnoreCase("N")) {
			JOptionPane.showMessageDialog(null, "Compra cancelada");
		}
		frasecliente="\nCantidad de producto: "+stockprod+"\nNombre cliente: "+nombrecliente;
	}
	
	public static void escribeCliente() {
		String frase=frasecliente;
		
		try {
			FileWriter escritor = new FileWriter("/Users/adolfo/eclipse-workspace/ExamenFinal/src/ExamenFinal/Fichero");
			
			for(int i=0;i<frase.length();i++) {
				escritor.write(frase.charAt(i));
			}
			
			System.out.println("Tarea completada");
			escritor.close();
			
		}catch(IOException e) {
			System.out.println("404 error en la ruta o el nombre del fichero");
	
		}
	}
	//Método para comprar a proveedor
	public static void ComprarProveedor() {
		int cont=0;
		int idprod=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el ID del producto"));
		int stockprod=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad que desea recargar del producto"));
		String nombreproveedor=JOptionPane.showInputDialog("Introduzca el nombre del proveedor");
		
		String confirmar=JOptionPane.showInputDialog(null,"Introduca S si desea confirmar la compra, sino pulse N" );
		
		if(confirmar.equalsIgnoreCase("S")) {
		for(Articulo a:articulos) {
			if(idprod==a.getId()) {
				cont++;
				a.comprarProveedor(stockprod);
				a.setNcompras(stockprod);
				JOptionPane.showMessageDialog(null, "\nDatos de la compra\nArtículo solicitado: "+a.getNombre()+"\nPrecio Total en euros: "+a.getPreciocompraproveedor()*stockprod+"\nNombre del proveedor: "+nombreproveedor +"\nTotal de artículos recargados: "+stockprod);
			}
		}
		if(cont==0) {
			JOptionPane.showMessageDialog(null, "No se ha encontrado ningún producto con esa ID");
		}
		}
		
		else if(confirmar.equalsIgnoreCase("N")) {
			JOptionPane.showMessageDialog(null, "Compra cancelada");
		}
		fraseproveedor="\nNombre del proveedor: "+nombreproveedor +"\nTotal de artículos recargados: "+stockprod;
		
	}
	public static void escribeProveedor() {
		String frase=fraseproveedor;
		
		try {
			FileWriter escritor = new FileWriter("/Users/adolfo/eclipse-workspace/ExamenFinal/src/ExamenFinal/Fichero");
			
			for(int i=0;i<frase.length();i++) {
				escritor.write(frase.charAt(i));
			}
			
			System.out.println("Tarea completada");
			escritor.close();
			
		}catch(IOException e) {
			System.out.println("404 error en la ruta o el nombre del fichero");
	
		}
	}
	
	//SUBMENÚ
	public static void GestionarArticulos() {
		int user=0;
		int submenu=0;
		do {
			user=Integer.parseInt(JOptionPane.showInputDialog("\n1.Añadir artículos\n2.Editar Artículo\n3.Eliminar artículo\n4.Volver menú principal"));
			
			switch(user) {
			case 1:
				JOptionPane.showMessageDialog(null, "Has seleccionado añadir artículos");
				AñadirArticulos();
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Has seleccionado editar artículos");
				EditarArticulos();
				break;
				
			case 3:
				JOptionPane.showMessageDialog(null, "Has seleccionado eliminar artículos");
				EliminarArticulos();
				break;
				
			case 4:
				JOptionPane.showMessageDialog(null, "Has seleccionado volver al menú principal");
				main(null);
				break;
			}
			
		}while(submenu==0);
	}
	
	//Método para añadir artículos
	public static void AñadirArticulos() {
		String nombre=JOptionPane.showInputDialog("Introduzca el nombre del artículo");
		float preciovcliente=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el precio de venta al cliente"));
		float preciocproveedor=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el precio de compra al proveedor"));
		int stockprod=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de stock del producto"));
		
		articulos.add(new Articulo(nombre,preciovcliente,preciocproveedor,stockprod));
		
		JOptionPane.showMessageDialog(null, "Datos del producto añadido"+articulos.get((articulos.size()-1)).toString());
		
	}
	
	//Método para editar artículos
	public static void EditarArticulos() {
		int cont=0;
		JOptionPane.showMessageDialog(null, "Por normas de 'Ultramarinos Cristobal e Hijos' solamente se pueden editar los precios");
		int idprod=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el ID del producto que desa editar"));
		float preciovcliente=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el precio a editar de venta al cliente"));
		float preciocproveedor=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el precio a editar de compra al proveedor"));
		
		for(Articulo a: articulos) {
			if(idprod==a.getId()) {
				cont++;
				a.setPrecioventacliente(preciovcliente);
				a.setPreciocompraproveedor(preciocproveedor);
				JOptionPane.showMessageDialog(null, "Producto editado");
			}
		}
		if(cont==0) {
			JOptionPane.showMessageDialog(null, "No se ha encontrado ningún producto con esa ID");
		}
	}
	
	//Método para borrar artículos
	public static void EliminarArticulos() {
		int cont=0;
		int idprod=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el ID del producto que desea borrar"));
		
		
		for(int i=0;i<articulos.size();i++) {
			if(idprod==articulos.get(i).getId()){
				cont++;
				articulos.remove(i);
				JOptionPane.showMessageDialog(null, "Artículo borrado");
			}
		}
		if(cont==0) {
			JOptionPane.showMessageDialog(null, "No se ha encontrado ningún producto con esa ID");
		}
	}
	
	//Método en el que se usa el collections sort con sus métodos de ordenación correspondientes.
	public static void Estadisticas() {
		System.out.println("---------------");
		System.out.println("Productos más vendidos");
		Collections.sort(articulos,new OrdenarVentas());
		
		for(Articulo a:articulos) {
			System.out.println(a.toString());
		}
		
		System.out.println("---------------");
		System.out.println("Productos más comprados");
		Collections.sort(articulos,new OrdenarCompras());
		
		for(Articulo a:articulos) {
			System.out.println(a.toString());
		}
	}
	
	public static void Calculadora() {
		float precio=Float.parseFloat(JOptionPane.showInputDialog("Introduzca el precio del producto"));
		int cantidad=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad del producto"));
		float descuento=Float.parseFloat(JOptionPane.showInputDialog("Introduzca el descuento"));
		
		float preciototal=(precio*cantidad)-descuento;
		preciototal=(float) (preciototal-(preciototal*0.21));
		
		JOptionPane.showMessageDialog(null, preciototal);
		
		
	}
	
	
	
}
