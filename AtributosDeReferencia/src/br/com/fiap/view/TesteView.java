package br.com.fiap.view;

import br.com.fiap.model.Computador;
import br.com.fiap.model.Monitor;

public class TesteView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computador objComputador = new Computador();

		objComputador.setFornecedor("Red Dragon");
		objComputador.setValor(3000);

		Monitor objMonitor = new Monitor();

		objMonitor.setMarca("HP");
		objMonitor.setTamanho(19);
		objMonitor.setTipo("Wide");

		objComputador.setMonitor(objMonitor);

		System.out.println(objComputador.getFornecedor());
		System.out.println(objComputador.getValor());

		// Podemos obter o retorno dos valores dos atributos da Classe Monitor de 2
		// formas:
		// Através do objeto do monitor, ou do objeto do Computador

		// retorno através do objeto da Classe Monitor
		System.out.println(objMonitor.getMarca());
		// retorno através do objeto da Classe Computador
		System.out.println(objComputador.getMonitor().getMarca());
		System.out.println(objComputador.getMonitor().getTamanho());
		System.out.println(objComputador.getMonitor().getTipo());

	}

}
