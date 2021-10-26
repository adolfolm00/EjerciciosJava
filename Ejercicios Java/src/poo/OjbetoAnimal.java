package poo;

public class OjbetoAnimal {

	public static void main(String[] args) {
		
		Animal perro= new Animal();
		
		perro.clasificacion="Mamífero";
		perro.alimentacion="Omnívoro";
		perro.patas=4;
		perro.color="Marrón";
		
		System.out.println(perro.imprimir());
		System.out.println(perro.ladrido());

	}

}
