package br.com.fiap.beans;

public class Livro {
	
	private int codigo;
	private String titulo;
	private String editora;
	private String autor;
	private int quantidade;
	private double valor;	
	
	public Livro() {
		super();
	}	
	
	public Livro(int codigo, String titulo, String editora, String autor, int quantidade, double valor) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.editora = editora;
		this.autor = autor;
		this.quantidade = quantidade;
		this.valor = valor;
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
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

}
