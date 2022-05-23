package br.com.fiap.view;

//Importa��o para o JOptionPane
import javax.swing.JOptionPane;

/*Importa��es das Classes para mesmo que estejam em outro pacote, no caso "model" (br.com.fiap.model),
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
				Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de a�ucar do brigadeiro")));
		objBrigadeiro.setChocolate(
				Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de chocolate do brigadeiro")));

		/*
		 * objBeijinho.setCoco(50); objBeijinho.setApelido("Beijinnho Beij�cas");
		 */

		objBeijinho.setCoco(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de coco do beijinho")));
		objBeijinho.setApelido(JOptionPane.showInputDialog("Digite o apelido"));

		System.out.println("\nA quantidade de Leite �: " + objDoce.getLeite());
		System.out.println("\nA quantidade de A�ucar �: " + objDoce.getAcucar());
		System.out.println("\nA quantidade de Chocolate �: " + objBrigadeiro.getChocolate());

		System.out.println("\nA quantidade de leite do Beijinho �: " + objBeijinho.getLeite()
				+ "\nA quantidade de a�ucar de a�ucar do Beijinho �: " + objBeijinho.getAcucar()
				+ "\nA quantidade de coco do Beijinho �: " + objBeijinho.getCoco() + "\nO apelido do "
				+ "doce beijinho da vov� �: " + objBeijinho.getApelido());

	}

}
