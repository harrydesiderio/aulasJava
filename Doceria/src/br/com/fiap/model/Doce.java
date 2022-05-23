package br.com.fiap.model;

public class Doce {

	private int leite;
	private int acucar;

	
	  public Doce (){	  
	  } 
	  
	  public Doce (int leite, int acucar){
	  this.leite = leite;
	  this.acucar = acucar;
	 }
	 

	public int getLeite() {
		return leite;
	}

	public void setLeite(int leite) {
		this.leite = leite;
	}

	public int getAcucar() {
		return acucar;
	}

	public void setAcucar(int acucar) {
		this.acucar = acucar;
	}

}
