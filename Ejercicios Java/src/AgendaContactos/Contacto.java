package AgendaContactos;

public class Contacto {
	
	private String name;
	private int numtlf;
	private String email;
	
	public Contacto(String name, String email, int numtlf) {
		super();
		this.name = name;
		this.email = email;
		this.numtlf = numtlf;
		
	}
	
	
	

	public String getName() {
		return name;
	}




	public int getNumtlf() {
		return numtlf;
	}




	public String getEmail() {
		return email;
	}




	public void setName(String name) {
		this.name = name;
	}




	public void setNumtlf(int numtlf) {
		this.numtlf = numtlf;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	@Override
	public String toString() {
		return "Contacto [name=" + name + ", numtlf=" + numtlf + ", email=" + email + "]";
	}
	
	

}
