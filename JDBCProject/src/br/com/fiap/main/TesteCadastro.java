package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Livro;
import br.com.fiap.dao.LivroDAO;

public class TesteCadastro {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		LivroDAO dao = new LivroDAO();
		
		Livro objLivro = new Livro();
		
		objLivro.setCodigo(inteiro("Código: "));
		objLivro.setTitulo(texto("Título: "));
		objLivro.setAutor(texto("Autor: "));
		objLivro.setValor(real("Valor: "));
		
		System.out.println(dao.Inserir(objLivro));
		
	}

}
