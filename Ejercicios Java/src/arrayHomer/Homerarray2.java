package arrayHomer;

public class Homerarray2 {

	public static void main(String[] args) {
		
		
		int [] numero = new int[50];
		int resto, num = 100;
		
		for (int i = 0; i <= 49; i++) {
			do {
				resto = num%2;
				if(resto == 0) {
					numero[i] = num;
				}
				num++;
			}while(resto != 0 || num == 200);
		}
		
		for (int i = 0; i <= 49; i++) {
			System.out.print(numero[i] + " ");
		}
	}

}
