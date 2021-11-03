package ExamenFinal;

import java.util.Comparator;

public class OrdenarID implements Comparator<Articulo> {

	@Override
	public int compare(Articulo o1, Articulo o2) {
		if(o1.getId()>o2.getId()) {
			return 1;
		}
		else if(o1.getId()>o2.getId()) {
			return 0;
		}
		else {
			return -1;
		}
	}
	}


