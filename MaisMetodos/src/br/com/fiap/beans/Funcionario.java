package br.com.fiap.beans;

public class Funcionario {

	private String nome;
	private double valorHora;
	private String cargo;

	public void setNome (String pNome) {
		nome = pNome;
	}

	public void setValorHora (double pValorHora) {
		valorHora = pValorHora;
	}

	public void setCargo (String cargo) {
		this.cargo = cargo;
	}

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
