package concesionario;

public class Coches {

	public static void main(String[] args) {
		Coche c1=new Coche("Audi","A5",4,211,4,6.9, "Diesel","Negro");
		Coche c2=new Coche("Mercedes","Clase A",5,136,5,3.9, "Diesel","Negro");
		
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
