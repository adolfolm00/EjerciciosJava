package poo;

public class Calculadora {

	private int n1;
	private int n2;
	private char operador;
	private int resultado;
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	public char getOperador() {
		return operador;
	}
	public void setOperador(char operador) {
		this.operador = operador;
	}
	
	public void setResultado() {
		int operacion;
		if(operador=='+') {
			operacion=n1+n2;
		}
		else if(operador=='-') {
			operacion=n1-n2;
		}
		else if(operador==':') {
			operacion=n1/n2;
		}
		else {
			operacion=n1*n2;
		}
		resultado=operacion;
	}
	
	public String toString() {
		
		
		return "El número 1 "+n1+""+operador+""+"el número 2 "+n2+" es: "+resultado;
	}


}
