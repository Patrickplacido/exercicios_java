package exercicio04;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Resposta resposta = new Resposta();
		
		for (int i = 0; i < 5; i++) {
			
			String escolha;
			do {
				escolha = JOptionPane.showInputDialog("Digite a resposta da questão " + (i+1) + ":");
			}while(!Validacao.validarResposta(escolha));
			
			switch (i) {
				case 0:
					resposta.setQuestao01(escolha);
					break;
				case 1:
					resposta.setQuestao02(escolha);
					break;
				case 2:
					resposta.setQuestao03(escolha);
					break;
				case 3:
					resposta.setQuestao04(escolha);
					break;
				case 4:
					resposta.setQuestao05(escolha);
			}
			
		}
		
		Gabarito gabarito = new Gabarito();
		
		for (int i = 0; i < 5; i++) {
					
			String escolha;
			do {
				escolha = JOptionPane.showInputDialog("Digite o gabarito da questão " + (i+1) + ":");
			}while(!Validacao.validarResposta(escolha));
			
			switch (i) {
				case 0:
					gabarito.setQuestao01(escolha);
					break;
				case 1:
					gabarito.setQuestao02(escolha);
					break;
				case 2:
					gabarito.setQuestao03(escolha);
					break;
				case 3:
					gabarito.setQuestao04(escolha);
					break;
				case 4:
					gabarito.setQuestao05(escolha);
			}
					
		}
		
		int nota = 0;
		
		if (resposta.getQuestao01().equals(gabarito.getQuestao01())){
			nota += 2;
		}
		if (resposta.getQuestao02().equals(gabarito.getQuestao02())){
			nota += 2;
		}
		if (resposta.getQuestao03().equals(gabarito.getQuestao03())){
			nota += 2;
		}
		if (resposta.getQuestao04().equals(gabarito.getQuestao04())){
			nota += 2;
		}
		if (resposta.getQuestao05().equals(gabarito.getQuestao05())){
			nota += 2;
		}
		
		JOptionPane.showMessageDialog(null, String.format("A nota do aluno foi: %d", nota));
		
	}
	
}
