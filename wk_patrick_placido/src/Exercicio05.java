import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Digite 4 notas para obter a media aritmetica");
		
		float[] vetor = new float[4];
		float somaNotas = 0;
		String conceito = null;

		for (int i = 0; i < 4; i++) {
			vetor[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor número " + (i+1) + ":"));
			somaNotas += vetor[i];
		}
		
		float media = somaNotas / 4;
		
		if (media >= 9) {
			conceito = "A";
		}else if (media >= 8) {
			conceito = "B";
		}else if (media >= 7) {
			conceito = "C";
		}else if(media > 0){
			conceito = "D";
		}
		
		JOptionPane.showMessageDialog(null, "O seu conceito é " + conceito);
	
	}

}
