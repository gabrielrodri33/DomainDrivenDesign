package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.beans.Livro;
import br.com.fiap.conexoes.ConexaoFactory;

public class LivroDAO {

	public Connection minhaConexao;
	
	//Metodo construtor com conexao
	public LivroDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	// Insert
	public String Inserir(Livro livro) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement
				("INSERT INTO tbl_jdbcproject_98626 VALUES(?,?,?,?)");
		
		stmt.setInt(1, livro.getCodigo());
		stmt.setString(2, livro.getTitulo());
		stmt.setString(3, livro.getAutor());
		stmt.setDouble(4, livro.getValor());
		
		stmt.execute();
		stmt.close();
		
		return "Cadastrado com sucesso";
	}
	
	//Delete
	public String deletar(Livro livro) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement
				("DELETE FROM tbl_jdbcproject_98626 WHERE codigo_livro = ?");
		
		stmt.setInt(1, livro.getCodigo());
		stmt.executeUpdate();
		stmt.close();
		
		return "Deletado com sucesso";
	}
	
}
