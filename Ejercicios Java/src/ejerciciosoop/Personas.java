package ejerciciosoop;

public class Personas {

	public static void main(String[] args) {
		
		Persona Persona1= new Persona("Adolfo",20,'H',65,1.80);
		
		Persona1.generaDNI();
		
		if(Persona1.calcularIMC()==-1) {
			System.out.println("Estás debajo de tu peso ideal");
		}
		else if(Persona1.calcularIMC()==0) {
			System.out.println("Estás en tu peso ideal");
		}
		else if(Persona1.calcularIMC()==1) {
			System.out.println("Estás por encima de tu peso ideal");
		}
		
		System.out.println(Persona1.toString());

}
}
