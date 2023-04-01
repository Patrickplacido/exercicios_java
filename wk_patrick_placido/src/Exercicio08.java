import javax.swing.JOptionPane;

public class Exercicio08 {

	public static void main(String[] args) {
		
		int[] vetor = new int[3];

		for (int i = 0; i < 3; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor número " + (i+1) + ":"));
		}

        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            maior = Math.max(maior, vetor[i]);
        }

        JOptionPane.showMessageDialog(null, "O maior número é: " + maior);

	}

}
