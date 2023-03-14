package br.com.fiap.main;

import br.com.fiap.modelo.Cliente;
import br.com.fiap.modelo.Endereco;
import br.com.fiap.modelo.Produto;

public class Exec {

	public static void main(String[] args) {
		
		//instanciar objetos
		Cliente objCliente = new Cliente();
		Endereco objEndereco = new Endereco();
		Produto objProduto = new Produto();
		
		//Entradas cliente
		objCliente.setNome("Gabriel Siqueira");
		objCliente.setIdade(19);
		objCliente.setPeso(59.5);
		objCliente.setEndereco(objEndereco);
		
		//Entrada endereço
		objEndereco.setBairro("Jardim Leonor Mendes de Barros");
		objEndereco.setLogradouro("Av. Professora Virgilia Rodrigues Alves de Carvalho Pinto");
		objEndereco.setMunicipio("São Paulo");
		objEndereco.setNumero(158);
		
		//Entrada produto
		objProduto.setTipo("Tênis");
		objProduto.setMarca("Nike");
		
		//Saída cliente
		System.out.println("Dados do cliente:\nNome: " + objCliente.getNome() + "\nIdade: " +
		objCliente.getIdade() + " anos" + "\nPeso: " + objCliente.getPeso() + " kg" + "\n\nEndereço do cliente:\nLogradouro: "+
				objCliente.getEndereco().getLogradouro() + "\nBairro: "+ objCliente.getEndereco().getBairro()+
				"\nNúmero: " + objCliente.getEndereco().getNumero() + "\nMunicípio: " +
				objCliente.getEndereco().getMunicipio() + "\n\nDetalhes do produto:\nTipo: " + objProduto.getTipo() +
				"\nMarca: " + objProduto.getMarca());
		
	}

}
