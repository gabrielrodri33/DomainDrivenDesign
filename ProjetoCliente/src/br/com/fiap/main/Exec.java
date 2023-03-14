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
		
		//Entrada endere�o
		objEndereco.setBairro("Jardim Leonor Mendes de Barros");
		objEndereco.setLogradouro("Av. Professora Virgilia Rodrigues Alves de Carvalho Pinto");
		objEndereco.setMunicipio("S�o Paulo");
		objEndereco.setNumero(158);
		
		//Entrada produto
		objProduto.setTipo("T�nis");
		objProduto.setMarca("Nike");
		
		//Sa�da cliente
		System.out.println("Dados do cliente:\nNome: " + objCliente.getNome() + "\nIdade: " +
		objCliente.getIdade() + " anos" + "\nPeso: " + objCliente.getPeso() + " kg" + "\n\nEndere�o do cliente:\nLogradouro: "+
				objCliente.getEndereco().getLogradouro() + "\nBairro: "+ objCliente.getEndereco().getBairro()+
				"\nN�mero: " + objCliente.getEndereco().getNumero() + "\nMunic�pio: " +
				objCliente.getEndereco().getMunicipio() + "\n\nDetalhes do produto:\nTipo: " + objProduto.getTipo() +
				"\nMarca: " + objProduto.getMarca());
		
	}

}
