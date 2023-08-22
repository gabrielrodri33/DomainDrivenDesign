package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;
import br.com.fiap.excecoes.Excecao;

public class TesteArrayException {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	public static void main(String[] args) throws Excecao{
		
		List<Produto> listaProdutos = new ArrayList<Produto>();
		
		Produto objProduto = null;
		
		do {
			try {
				objProduto = new Produto();
				objProduto.setTipo(texto("Tipo: "));
				objProduto.setMarca(texto("Marca: "));
				objProduto.setQuantidade(inteiro("Quantidade: "));
				objProduto.setValor(real("Valor: "));
				listaProdutos.add(objProduto);

			} catch (Exception e) {
				throw new Excecao(e);
			}
			
		} while (JOptionPane.showConfirmDialog(null, "Adicionar produto?", "Carrinho de compras",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==0);
		
		for(Produto p : listaProdutos) {
			System.out.println("Tipo: " + p.getTipo() +
							   "\nMarca: " + p.getMarca() +
							   "\nQuantidade: " + p.getQuantidade() +
							   "\nValor: " + p.getValor());
		}
	}

}
