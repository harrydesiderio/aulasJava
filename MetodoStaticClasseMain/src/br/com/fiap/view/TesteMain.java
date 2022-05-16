package br.com.fiap.view;

import javax.swing.JOptionPane;

import br.com.fiap.model.Cliente;
import br.com.fiap.model.Endereco;

public class TesteMain {

	/* Com Static no metodo não é necessário Instaciar seu objeto
	   toda vez que for utilizar, só coloca o nome do metodo 
	 */
	static String texto (String digitado) {
		return JOptionPane.showInputDialog(digitado).toUpperCase();
	}
	static int inteiro (String digitado) {
		return Integer.parseInt(JOptionPane.showInputDialog(digitado));
	}
	//metodo Static para retornar o total de caracteres 
	static int totalCaracteres(String digitado) {
		return digitado.length();
	}

	//metodo static se digitar menos de uma letra responde "Nome desconhecido"
	/*static String textoRegra (String digitado) {
		String qtLetras = JOptionPane.showInputDialog(digitado).toUpperCase();
		if (totalCaracteres(qtLetras) <=1) {
			return "Nome Desconhecido";
		}else {
			return qtLetras;
		}
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Atraves da Classe Cliente, Instancia objeto cliente 
		Cliente c = new Cliente();

		c.setNome(texto("Digite o nome: "));
		c.setEmail(texto("Digite o email: "));
		c.setFone(texto("Digite o Fone: "));

		/*Obs: para fazer o Set do atributo endereco que esta dentro da Classe
		  Cliente através da Classe Endereco, é preciso Instaciar a Classe 
		  Endereco na Classe Main e fazer o Set completo do Endereco antes...   
		 */	

		// Atraves da Classe Endereco, Instancia objeto endereco 
		Endereco e = new Endereco();

		e.setLogradouro(JOptionPane.showInputDialog("Digite o Logradouro: "));
		e.setNumero(JOptionPane.showInputDialog("Digite o Numero: "));
		e.setBairro(JOptionPane.showInputDialog("Digite o Bairro: "));
		e.setCidade(JOptionPane.showInputDialog("Digite a Cidade: "));
		e.setUf(JOptionPane.showInputDialog("Digite a UF: "));
		//e.setCep(Integer.parseInt(JOptionPane.showInputDialog("Digite o CEP: ")));
		e.setCep(inteiro("Digite o CEP"));
		e.setComplemento(JOptionPane.showInputDialog("Digite o Complemento: "));

		/*Agora é feito o set do atributo endereco que esta na classe Cliente,
		  que recebe o objeto da Classe Endereco por parametro*/

		c.setEndereco(e);

		// Agora fazemos todas as saidas do que foi digitado para ser apresentado 
		System.out.println(c.getNome());
		System.out.println(c.getEmail());
		System.out.println(c.getFone());

		System.out.println(e.getLogradouro());
		System.out.println(e.getNumero());
		System.out.println(e.getBairro());
		System.out.println(e.getCidade());
		System.out.println(e.getUf());
		System.out.println(e.getCep());
		System.out.println(e.getComplemento());




	}

}
