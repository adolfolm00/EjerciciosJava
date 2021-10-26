package arrayObjetos;

public class Youtuber {
	
	private String alias;
	private int seguidores;
	private int videos;
	private String pais;
	private int anocuenta;
	
	
	public Youtuber(String alias, int seguidores, int videos, String pais, int anocuenta) {
		super();
		this.alias = alias;
		this.seguidores = seguidores;
		this.videos = videos;
		this.pais = pais;
		this.anocuenta = anocuenta;
		
		
	}
	
	
	

	public int getSeguidores() {
		return seguidores;
	}




	public void setSeguidores(int seguidores) {
		this.seguidores = seguidores;
	}




	@Override
	public String toString() {
		return "Youtuber [alias=" + alias + ", seguidores=" + seguidores + ", videos=" + videos + ", pais=" + pais
				+ ", anocuenta=" + anocuenta + "]";
	}




	
	

	


	


	
	
	
	
	

}
