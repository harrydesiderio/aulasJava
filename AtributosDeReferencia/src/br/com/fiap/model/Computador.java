package br.com.fiap.model;

public class Computador {

	private double valor;
	private String fornecedor;
	private Monitor monitor;

	public Computador() {
		super();
	}

	public Computador(double valor, String fornecedor, Monitor monitor) {
		super();
		this.valor = valor;
		this.fornecedor = fornecedor;
		this.monitor = monitor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

}
