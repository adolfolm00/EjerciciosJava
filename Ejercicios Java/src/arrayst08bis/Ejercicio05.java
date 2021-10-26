package arrayst08bis;


public class Ejercicio05 {

	public static void main(String[] args) {
		
		int [][]n=new int [6][10];
		
		for(int f=0;f<n.length;f++) {
			for(int c=0;c<n[2].length;c++) {
				n[f][c]=(int)(Math.random()*1000);
			}
		}
		
		for(int f=0;f<n.length;f++) {
			for(int c=0;c<n[2].length;c++) {
				System.out.print(n[f][c]+"\t");
			}
			System.out.println();
		}
		
		int max=0;
		int min=0;
		
		for(int f=0;f<n.length;f++) {
			for(int c=0;c<n[2].length;c++) {
				if(n[f][c]>max) {
					max=n[f][c];
				}
			}
		}
		
		for(int f=0;f<n.length;f++) {
			for(int c=0;c<n[2].length;c++) {
				if(n[f][c]==max) {
					System.out.println("El máximo está en la posición: ["+f+"]["+c+"] y es el número: "+n[f][c]);
				}
			}
		}
		
		
		min=n[0][0];
		for(int f=0;f<n.length;f++) {
			for(int c=0;c<n[2].length;c++) {
				if(n[f][c]<min) {
					min=n[f][c];
				}
			}
		}
		
		for(int f=0;f<n.length;f++) {
			for(int c=0;c<n[2].length;c++) {
				if(n[f][c]==min) {
					System.out.println("El mínimo está en la posición: ["+f+"]["+c+"] y es el número: "+n[f][c]);
				}
			}
		}
		
		
		
		
		
		
		
		
		

	}

}
