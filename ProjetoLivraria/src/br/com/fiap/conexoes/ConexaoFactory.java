package br.com.fiap.conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	
	//metodo de conexao
	public Connection conexao() throws ClassNotFoundException, SQLException {
		
		//Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection("jdbc:oracl e:thin:@oracle.fiap.com.br:1521:orcl","RM98626", "311003");
	}
	
}