package ejerciciost7;

public class Ejercicio09 {

	public static void main(String[] args) {
		
		int figuras;
		int fig1=0;
		int fig2=0;
		int fig3=0;
		
		
		for(int i=1;i<=3;i++) {
			figuras=(int)(Math.random()*5+1);
			
			if(i==1) {
				fig1=figuras;
			}
			else if(i==2) {
				fig2=figuras;
			}
			else if(i==3) {
				fig3=figuras;
			}
			
			switch(figuras) {
			case 1: System.out.println("corazón");
				break;
			case 2:System.out.println("diamante");
				break;
			case 3:System.out.println("herradura");
				break;
			case 4:System.out.println("campana");
				break;
			case 5:System.out.println("limón");
				break;
			}
		}
		
			if(fig1==fig2 && fig2==fig3){
				System.out.println("Enhorabuena, ha ganado 10 monedas");
			}
			else if(fig1==fig2 || fig2==fig1 || fig1==fig3 || fig3==fig1 || fig2==fig3 || fig3==fig2) {
				System.out.println("Bien,ha recuperado su moneda");
			}
			else {
				System.out.println("Lo siento, ha perdido");
			}
		
		
		
		
		
		

	}

}
