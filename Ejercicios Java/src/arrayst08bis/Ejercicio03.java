package arrayst08bis;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		int [][]r=new int[4][4];
		int [][]s=new int[4][4];
		
		for(int f=0;f<r.length;f++) {
			for(int c=0;c<r.length;c++) {
				r[f][c]=(int)(Math.random()*6);	
			}
		}
		
		for(int f=0;f<r.length;f++) {
			for(int c=0;c<r.length;c++) {
				s[f][c]=(int)(Math.random()*6);	
			}
		}
		
		
		
		for(int f=0;f<r.length;f++) {
			for(int c=0;c<r.length;c++) {
				System.out.print(r[f][c]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int f=0;f<r.length;f++) {
			for(int c=0;c<r.length;c++) {
				System.out.print(r[f][c]+"\t");
			}
			System.out.println();
		}
		
		
		
		for(int f=0;f<r.length;f++) {
			for(int c=0;c<r.length;c++) {
				if(r[f][c]==s[f][c]) {
					System.out.println("Elemento común");
					System.out.println(s[f][c]);
				}
			}
		}

	}

}
