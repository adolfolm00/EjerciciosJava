package ExamenFinal;

import java.util.Comparator;

public class OrdenarVentas implements Comparator<Articulo> {

	@Override
	public int compare(Articulo o1, Articulo o2) {
		if(o1.getNventas()>o2.getNventas()) {
			return -1;
		}
		else if(o1.getNventas()>o2.getNventas()) {
			return 0;
		}
		else {
			return 1;
		}
	}

}
