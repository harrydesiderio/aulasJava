package br.com.fiap.model;

public class Cliente {

	private String nome;
	private String email;
	private String fone;
	private Endereco endereco;


	//Gets
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public String getFone() {
		return fone;
	}
	public Endereco getEndereco() {
		return endereco;
	}


	//Sets
	public void setNome (String pNome) {
		nome = pNome;
	} 

	public void setEmail(String pEmail) {
		email = pEmail;
	}

	public void setFone (String pFone) {
		fone = pFone;
	}

	public void setEndereco(Endereco pEndereco) {
		endereco = pEndereco;
	}

}
