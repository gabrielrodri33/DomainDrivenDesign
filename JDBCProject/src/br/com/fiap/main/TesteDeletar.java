package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Livro;
import br.com.fiap.dao.LivroDAO;

public class TesteDeletar {
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Instanciar objetos
		LivroDAO dao = new LivroDAO();
		
		Livro objLivro = new Livro();
		
		objLivro.setCodigo(inteiro("Digite o codigo do livro a ser deletado"));
		
		System.out.println(dao.deletar(objLivro));

	}

}
