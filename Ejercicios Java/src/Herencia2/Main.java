package Herencia2;

public class Main {

	public static void main(String[] args) {
		
		Empleado n1=new Comercial("Adolfo",50,30);
		Empleado n2=new Repartidor("Juan",40,10,1);
		
		System.out.println(n1.toString());
		System.out.println(n2.toString());

		
	}

}
