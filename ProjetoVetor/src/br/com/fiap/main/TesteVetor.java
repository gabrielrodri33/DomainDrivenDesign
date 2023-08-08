package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteVetor {
	
	// texto
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	// int
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	// double
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	
	public static void main(String[] args) {
		
		Produto[] vetorProduto = new Produto[5];
		
		int indice = 0;
		
		do {
			// Instanciar objetos
			vetorProduto[indice] = new Produto();
			vetorProduto[indice].setTipo(texto("Tipo do prduto: "));
			vetorProduto[indice].setMarca(texto("Marca: "));
			vetorProduto[indice].setQuantidade(inteiro("Quantidade: "));
			vetorProduto[indice].setValor(real("Valor: "));
			
			indice ++;
		}while(JOptionPane.showConfirmDialog(null, "Adicionar produto no carrinho?", "Carrinho de compras:", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);

		for(int contador = 0; contador < indice; contador ++) {
			System.out.println("Tipo do produto: " + vetorProduto[contador].getTipo() +
					"\nMarca: " + vetorProduto[contador].getMarca() + 
					"\nQuantidade: " + vetorProduto[contador].getQuantidade() + 
					"\nValor: " + vetorProduto[contador].getValor());

		}
	}	

}
