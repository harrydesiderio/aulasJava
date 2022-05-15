package br.com.fiap.beans;

public class Carro {
	private String marca;
	private double valor;

	//Ao usar encapsulamento...
	//usamos metodo set para adicionar, manipular dados em atributos
	public void setMarca(String pMarca){
		marca = pMarca;
	}
	public void setValor(double pValor){
		valor = pValor;
	}

	//usamos metodo get para exibe, retornar valores dos atributos
	public String getMarca(){
		return marca;
	}
	public double getValor(){
		return valor;
	}

	//Exemplo metodo get...
	//Apenas exibe os valores dos dois atributos
	public String getTodos(){
		return marca + " - " + valor;
	}

}
