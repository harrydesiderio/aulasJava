package br.com.fiap.view;

//Importação para o JOptionPane
import javax.swing.JOptionPane;

/*Importações das Classes para mesmo que estejam em outro pacote, no caso "model" (br.com.fiap.model),
  poderem ser Instanciados os objetos na Classe TesteView do package br.com.fiap.view       */
import br.com.fiap.model.Beijinho;
import br.com.fiap.model.Brigadeiro;
import br.com.fiap.model.Doce;

public class TesteView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Doce objDoce = new Doce(50, 50);
		Brigadeiro objBrigadeiro = new Brigadeiro();
		Beijinho objBeijinho = new Beijinho();

		// Exemplo Set sem JOptionPane
		objDoce.setLeite(100);
		objDoce.setAcucar(30);
		objBrigadeiro.setChocolate(500);
		
		// Exemplo Set com JOptionPane
		objBrigadeiro
				.setLeite(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de leite do brigadeiro")));
		objBrigadeiro.setAcucar(
				Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de açucar do brigadeiro")));
		objBrigadeiro.setChocolate(
				Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de chocolate do brigadeiro")));

		/*
		 * objBeijinho.setCoco(50); objBeijinho.setApelido("Beijinnho Beijócas");
		 */

		objBeijinho.setCoco(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de coco do beijinho")));
		objBeijinho.setApelido(JOptionPane.showInputDialog("Digite o apelido"));

		System.out.println("\nA quantidade de Leite é: " + objDoce.getLeite());
		System.out.println("\nA quantidade de Açucar é: " + objDoce.getAcucar());
		System.out.println("\nA quantidade de Chocolate é: " + objBrigadeiro.getChocolate());

		System.out.println("\nA quantidade de leite do Beijinho é: " + objBeijinho.getLeite()
				+ "\nA quantidade de açucar de açucar do Beijinho é: " + objBeijinho.getAcucar()
				+ "\nA quantidade de coco do Beijinho é: " + objBeijinho.getCoco() + "\nO apelido do "
				+ "doce beijinho da vovó é: " + objBeijinho.getApelido());

	}

}
