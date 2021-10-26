package arrayst08bis;

public class Ejercicio06 {

	public static void main(String[] args) {
		
int [][]n=new int [6][10];
		
		for(int f=0;f<n.length;f++) {
			for(int c=0;c<n[2].length;c++) {
				n[f][c]=(int)(Math.random()*1000);
			}
		}
		
		int i=0;
		do {
		for(int f=0;f<n.length;f++) {
			for(int c=0;c<n[2].length;c++) {
				if(n[f][c]==i) {
					do {
						n[f][c]=(int)(Math.random()*1000);
					}
					while(n[f][c]==i);
				}
				i++;
			}
		}
		}
		while(i<1000);
		
		
		for(int f=0;f<n.length;f++) {
			for(int c=0;c<n[2].length;c++) {
				System.out.print(n[f][c]+"\t");
			}
			System.out.println();
		}
		


	}

}
