package br.com.fiap.model;

public class Funcionario {
	
	private String nome;
	private double valorHora;
	private String cargo;
	
	//Metodo Construtor vazio 
	public Funcionario() {
		
	}
	
	//Metodo Construtor com o atributo nome
	public Funcionario(String nome) {
		this.nome = nome;
	}
	
	//Metodo Construtor com o atributo valorHora 
	public Funcionario (double valorHora) {
		this.valorHora = valorHora;
	}
	
	//Metodo cosntrutor com todos os atributos
	public Funcionario(String nome, double valorHora, String cargo) {
		this.nome = nome;
		this.valorHora = valorHora;
		this.cargo = cargo;
	}
	
	//Metodos Setters
	public void setNome (String pNome) {
		nome = pNome;
	}

	public void setValorHora (double pValorHora) {
		valorHora = pValorHora;
	}

	public void setCargo (String cargo) {
		this.cargo = cargo;
	}
	
	//Metodos Getters
	public String getNome() {
		return nome;
	}

	public double getValorHora() {
		return valorHora;
	}

	public String getCargo() {
		return cargo;
	}

	//Metodo Get que exibe resultado para mais de uma propriedade
	public String getTudo() {
		return "Nome: " + nome + "\nCargo: " + cargo + "\nValor-Hora: " + valorHora;
	}

	//Metodo Worker 	
	public double calcSalarioBruto(int qtdeHoras) {
		return valorHora * qtdeHoras;		
	}

	public double calcularIr(int qtdeHoras, double percentual) {
		return (valorHora * qtdeHoras) * (percentual / 100);
	}


}
