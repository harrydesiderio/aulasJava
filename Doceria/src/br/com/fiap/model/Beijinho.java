package br.com.fiap.model;

public class Beijinho extends Doce{

	private int coco;
	private String apelido;

	
	  public Beijinho(){	
		  super();
	 }
	  
	 public Beijinho (int recebeLeite, int recebeAcucar, int recebeCoco, String
	 recebeApelido){ super(recebeLeite, recebeAcucar); 
	 this.coco = recebeCoco;
	 this.apelido = recebeApelido; }
	 

	public int getCoco() {
		return coco;
	}

	public void setCoco(int coco) {
		this.coco = coco;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public void mostrarOi() {
		System.out.println("\nOi");
	}

	public void mostrarAdeus() {
		System.out.println("Adeus");
	}

}
