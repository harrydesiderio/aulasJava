package br.com.fiap.main;

import br.com.fiap.beans.Carro;

public class TestesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//INSTANCIAR OBJETO CARRO
		//1� Faz referencia a classe Carro
		//2� Nomeia o objeto 
		//3� Cria uma nova instancia        
		Carro objCarro = new Carro();

		//INSTANCIAR OBJETO MOTO
		//1� Faz referencia a classe Moto
		//2� Nomeia o objeto 
		//3� Cria uma nova instancia 
		//Moto objMoto = new Moto();			

		//acesso atrav�s do metodo set 
		objCarro.setMarca("Java � f�cil");
		objCarro.setValor(25);

		//exibe atrav�s do metodo get 
		System.out.println(objCarro.getMarca());
		System.out.println(objCarro.getValor());

		System.out.println(objCarro.getTodos());

	}

}
