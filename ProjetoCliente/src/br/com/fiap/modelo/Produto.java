package br.com.fiap.modelo;

public class Produto {
	
	private String tipo;
	private String marca;
	
	//setters
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	public void setMarca(String marca){
		this.marca = marca;
	}
	
	//getters
	public String getTipo(){
		return tipo;
	}
	public String getMarca(){
		return marca;
	}
}
