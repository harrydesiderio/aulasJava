package br.com.fiap.model;

public class Endereco {

	//atributos

	private String logradouro;
	private String numero;
	private String bairro;
	private String cidade;
	private String uf;
	private int cep;
	private String complemento;

	//gets 
	public String getLogradouro() {
		return logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public String getBairro() {
		return bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public String getUf() {
		return uf;
	}
	public int getCep() {
		return cep;
	}
	public String getComplemento() {
		return complemento;
	}
		
	//sets
	public void setLogradouro(String pLogradouro) {
		logradouro = pLogradouro;
	}
	public void setNumero(String pNumero) {
		numero = pNumero;
	}
	public void setBairro(String pBairro) {
		bairro = pBairro;
	}
	public void setCidade (String pCidade) {
		cidade = pCidade;
	}
	public void setUf (String pUf) {
		uf = pUf;
	}
	public void setCep (int pCep) {
		cep = pCep;
	}
	public void setComplemento(String pComplemento) {
		complemento = pComplemento;
	}
	
}
