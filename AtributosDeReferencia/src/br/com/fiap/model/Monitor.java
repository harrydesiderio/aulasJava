package br.com.fiap.model;

public class Monitor {

	private String marca;
	private float tamanho;
	private String tipo;

	public Monitor() {
		super();
	}

	public Monitor(String marca, float tamanho, String tipo) {
		super();
		this.marca = marca;
		this.tamanho = tamanho;
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
