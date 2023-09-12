package br.com.fiap.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.conexoes.ConexaoFactory;

public class TexteConexao {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection c = new ConexaoFactory().conexao();
		
		System.out.println("Conectado com banco");
		
		c.close();
	}

}
