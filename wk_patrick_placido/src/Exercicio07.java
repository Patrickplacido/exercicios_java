import javax.swing.JOptionPane;

public class Exercicio07 {

	public static void main(String[] args) {
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
		
		if (idade > 65) {
			JOptionPane.showMessageDialog(null, "Eleitor Facultativo");
		}else if (idade >= 18) {
			JOptionPane.showMessageDialog(null, "Eleitor Obrigatório");
		}else {
			JOptionPane.showMessageDialog(null, "Não Eleitor");
		}

	}

}
