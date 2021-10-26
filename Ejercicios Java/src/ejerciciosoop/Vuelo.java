package ejerciciosoop;

public class Vuelo {
	
	private String origen;
	private String destino;
	private int kms;
	private int id;
	private static int idsiguiente=1;
	
	public Vuelo(String origen, String destino, int kms) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.kms = kms;
		
		id=idsiguiente;
		idsiguiente++;
	}
	
	
	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getKms() {
		return kms;
	}

	public void setKms(int kms) {
		this.kms = kms;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Vuelo [origen=" + origen + ", destino=" + destino + ", kms=" + kms + ", id=" + id + "]";
	}
	
	
	
	
	

}
