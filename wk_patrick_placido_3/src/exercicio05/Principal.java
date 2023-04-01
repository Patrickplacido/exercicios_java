package exercicio05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int escolha;
		do {
			escolha = Integer.parseInt(JOptionPane.showInputDialog("O que você deseja?\n" +
															       "1 - Cadastrar peças\n" +
															       "2 - Remover peça\n" +
															       "3 - Ver todas as peças\n" +
															       "4 - Sair"));
			
			switch (escolha) {
			
				case 1:
					int n = Integer.parseInt(JOptionPane.showInputDialog("Quantas peças deseja cadastrar?"));
					for (int i = 0; i < n; i++) {
						Estoque.cadastrarPeca();
					}
					break;
				case 2:
					int posicao = Integer.parseInt(JOptionPane.showInputDialog("Qual a posição da peça que deseja remover?"));
					Estoque.remove(posicao);
					break;
				case 3:
					Estoque.verPecas();
			
			}
		}while(escolha != 4);
		
	}

}
