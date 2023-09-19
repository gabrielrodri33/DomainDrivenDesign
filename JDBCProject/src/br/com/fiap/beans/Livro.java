package br.com.fiap.beans;

public class Livro {
	
	private int codigo;
	private String titulo;
	private String autor;
	private double valor;
	public Livro(int codigo, String titulo, String autor, double valor) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.valor = valor;
	}
	public Livro() {
		super();
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
