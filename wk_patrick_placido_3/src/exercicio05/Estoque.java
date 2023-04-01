package exercicio05;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Estoque {
	
	private static ArrayList<Peca> listaDePecas = new ArrayList<Peca>();

	public static void cadastrarPeca() {
		
		Peca peca = new Peca();
		
		peca.setDescricao(JOptionPane.showInputDialog("Insira a descrição: "));
		peca.setPreco(Float.parseFloat(JOptionPane.showInputDialog("Insira o preço: ")));
		peca.setCor(JOptionPane.showInputDialog("Insira a cor: "));
		peca.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Insira a altura: ")));
		peca.setLargura(Float.parseFloat(JOptionPane.showInputDialog("Insira a largura: ")));
		
		listaDePecas.add(peca);
		
	}
	
	public static void verPecas() {
		
		for (int i = 0; i < listaDePecas.size(); i++) {
			Peca peca = listaDePecas.get(i);
			JOptionPane.showMessageDialog(null, String.format("[%d] %s:\n" + 
												"Preço: R$ %.2f\n" + 
												"Cor: %s\n" + 
												"Altura: %.2f\n" + 
												"Largura: %.2f", 
												i,
												peca.getDescricao(),
												peca.getPreco(),
												peca.getCor(),
												peca.getAltura(),
												peca.getLargura()));
		}
		
		
	}


	public static void remove(int posicao) {
		
		listaDePecas.remove(posicao);
		
	}
	
}
