package br.com.fiap.model;

public class Brigadeiro extends Doce {

	private int chocolate;
	
	
	public Brigadeiro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Brigadeiro(int chocolate) {
		super();
		this.chocolate = chocolate;
	}

	

	public Brigadeiro(int leite, int acucar) {
		super(leite, acucar);
		// TODO Auto-generated constructor stub
	}

	public int getChocolate() {
		return chocolate;
	}

	public void setChocolate(int chocolate) {
		this.chocolate = chocolate;
	}

}
