package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Funcionario;

public class TestesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instancia objeto funcionario da classe funcionario
		Funcionario objFuncionario = new Funcionario();		

		//Sets 
		objFuncionario.setNome(JOptionPane.showInputDialog("Digite o nome do Funcionário"));
		objFuncionario.setCargo(JOptionPane.showInputDialog("Digite o Cargo"));
		objFuncionario.setValorHora(Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor "+"-"+"Hora")));

		//Gets 
		System.out.println("Nome: " + objFuncionario.getNome());
		System.out.println("Cargo: " + objFuncionario.getCargo());
		System.out.println("Valor-Hora: " + objFuncionario.getValorHora());

		//System.out.println(objFuncionario.getTudo());
		System.out.println("Salário Bruto: " + objFuncionario.calcSalarioBruto(200));
		System.out.println("IR: " + objFuncionario.calcularIr(200,12));

		/*Exemplos Set e Get com input através da classe Scanner sem JOptionPane  
				Scanner entrada = new Scanner(System.in);

				System.out.println("Digite o nome: ");				
				objFuncionario.setNome(entrada.next());		
				System.out.println("O nome do funcionario é: " + objFuncionario.getNome());
				entrada.close();*/

	}

}
