package Herencia3;

public class Principal {

	public static void main(String[] args) {
		
		Medio n1=new Avion("Avión",150,800,"A390");
		Medio n2=new Tren("Tren",400,300,"Renfe");
		Medio n3=new Coche("Coche", 4, 235, 2, "Negro", "Audi", "A5");
		Coche n4=new Deportivo("Mercedes", 2, 325, 2, "Gris", "Mercedes", "AMG-GT", 550);
		Coche n5=new Familiar("Hyundai", 5, 5, 200, "Blanco", "Hyundai", "Tucson", true);
		
		System.out.println(n1.toString());
		System.out.println(n2.toString());
		System.out.println(n4.toString());
		System.out.println(n5.toString());
	}

}
