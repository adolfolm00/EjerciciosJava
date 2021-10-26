package poo;

public class Principal {

	public static void main(String[] args) {
		
		Coche ferrari= new Coche();
		
		ferrari.color="rojo";
		ferrari.marca="Ferrari";
		ferrari.modelo="F50";
		ferrari.velocidad=210;
		ferrari.puertas=2;
		
		System.out.println(ferrari.imprimir());
		
		System.out.println(ferrari.avanzar());
	}

}
