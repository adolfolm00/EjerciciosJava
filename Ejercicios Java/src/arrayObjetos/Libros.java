package arrayObjetos;

public class Libros {

	public static void main(String[] args) {
		
		Libro l1=new Libro("Miguel de Cervantes","Don Quijote de la Mancha","12443J",10000);
		Libro l2=new Libro("Philip K Dick","Blade Runner","38503A",5000);
		Libro l3=new Libro("Alejandro Dumas","Conde de Montecristo","39428B",9000);
		
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		System.out.println(l3.toString());
	}

}
