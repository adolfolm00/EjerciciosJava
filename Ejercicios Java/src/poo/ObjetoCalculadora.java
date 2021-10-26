package poo;

public class ObjetoCalculadora {

	public static void main(String[] args) {
		Calculadora op1=new Calculadora();
		Calculadora op2=new Calculadora();
		Calculadora simbolo=new Calculadora();
		
		op1.setN1(2);
		op2.setN2(3);
		simbolo.setOperador('*');
		
		
		System.out.println(simbolo.toString());
		

	}

}
