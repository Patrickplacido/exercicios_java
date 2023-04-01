import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int[] vetor = new int[10];

		for (int i = 0; i < 10; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor número " + (i+1) + ":"));
		}
		
		int valorBusca = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro qualquer:"));
		boolean encontrado = false;
		int posicao = -1;
		
		for (int i = 0; i < 10; i++) {
			if (vetor[i] == valorBusca) {
				encontrado = true;
				posicao = i;
				break; 
			}
		}
		
		if (encontrado) {
			JOptionPane.showMessageDialog(null, "O valor " + valorBusca 
			+ " foi encontrado na posição " + posicao + " do vetor");
		} else {
			JOptionPane.showMessageDialog(null, "O valor " + valorBusca 
			+ " não foi encontrado no vetor");
		}
		
	}
	
}
