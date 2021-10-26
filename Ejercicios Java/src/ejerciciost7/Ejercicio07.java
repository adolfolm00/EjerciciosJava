package ejerciciost7;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		int n=0;
		int longitud=0;
		String caracter=" ";
		
		for(int i=0;i<10;i++) {
			n=(int)(Math.random()*5);
			longitud=(int)(Math.random()*40+1);
			
			if(n==0) {
				caracter="*";
			}
			else if(n==1) {
				caracter="-";
			}
			else if(n==2) {
				caracter="=";
			}
			else if(n==3) {
				caracter=".";
			}
			else if(n==4) {
				caracter="|";
			}
			else if(n==5) {
				caracter="@";
			}
		}
		
		for(int i=0;i<longitud;i++) {
			System.out.println(caracter);
		}

	}

}
