package ExamenFinal;

import java.util.Comparator;

public class OrdenarCompras implements Comparator<Articulo> {

	@Override
	public int compare(Articulo o1, Articulo o2) {
		if(o1.getNcompras()>o2.getNcompras()) {
			return -1;
		}
		else if(o1.getNcompras()>o2.getNcompras()) {
			return 0;
		}
		else {
			return 1;
		}
	}

}
