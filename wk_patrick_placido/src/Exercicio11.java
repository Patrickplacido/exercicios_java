import javax.swing.JOptionPane;

public class Exercicio11 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posição [" + (i+1) + "][" + (j+1) + "] da matriz:"));
			}
		}

		int soma = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				soma += matriz[i][j];
			}
		}

		JOptionPane.showMessageDialog(null, "A soma de todos os elementos da matriz é: " + soma);


	}

}
