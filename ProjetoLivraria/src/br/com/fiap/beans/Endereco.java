package br.com.fiap.beans;

public class Endereco {
	private String cep;
	private String logradouro;
	private String bairro;
	private String loalidade;
	
	public Endereco() {
		super();
	}

	public Endereco(String cep, String logradouro, String bairro, String loalidade) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.loalidade = loalidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLoalidade() {
		return loalidade;
	}

	public void setLoalidade(String loalidade) {
		this.loalidade = loalidade;
	}

	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", logradouro=" + logradouro + ", bairro=" + bairro + ", loalidade=" + loalidade
				+ "]";
	}
}
