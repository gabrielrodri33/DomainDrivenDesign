package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.beans.Livro;
import br.com.fiap.conexoes.ConexaoFactory;

public class LivroDAO {

	public Connection minhaConexao;
	
	public LivroDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	// Insert 
	public String inserir (Livro livro) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement
				(" insert into T_FIAP_Livro values (?,?,?,?,?,?)");
		stmt.setInt(1, livro.getCodigo());
		stmt.setString(2, livro.getTitulo());
		stmt.setString(3, livro.getEditora());
		stmt.setString(4, livro.getAutor());
		stmt.setInt(5, livro.getQuantidade());
		stmt.setDouble(6, livro.getValor());
		stmt.execute();
		stmt.close();
		
		return "Cadastro com sucesso";		
	}
	
}
