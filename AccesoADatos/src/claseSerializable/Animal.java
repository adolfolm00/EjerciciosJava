package claseSerializable;

import java.io.Serializable;

public class Animal implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer num_patas;
	private String nombre;
	private String tipo;
	private Boolean vivo_muerto;
	
	
	public Animal(Integer num_patas, String nombre, String tipo, Boolean vivo_muerto) {
		super();
		this.num_patas = num_patas;
		this.nombre = nombre;
		this.tipo = tipo;
		this.vivo_muerto = vivo_muerto;
	}
	
	public Integer getNum_patas() {
		return num_patas;
	}
	public String getNombre() {
		return nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public Boolean getVivo_muerto() {
		return vivo_muerto;
	}
	public void setNum_patas(Integer num_patas) {
		this.num_patas = num_patas;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setVivo_muerto(Boolean vivo_muerto) {
		this.vivo_muerto = vivo_muerto;
	}
	
	

}
