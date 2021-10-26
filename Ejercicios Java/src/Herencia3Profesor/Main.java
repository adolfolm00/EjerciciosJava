package Herencia3Profesor;

public class Main {

	public static void main(String[] args) {
		
		Coche n1= new Coche("miCoche",5,128,5, "rojo","Fiat","Multipla");
		Tren t1= new Tren("trenecito",200,370,"AVE");
		Avion a1=new Avion("miJet",18,420,"A300");
		
		
      System.out.println(n1.toString());
      System.out.println(t1.toString());
      System.out.println(a1.toString());
	}

}
