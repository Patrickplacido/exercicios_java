import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		
		float quantidadeLatao = 0;
		
		quantidadeLatao = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de Latão em quilos desejada:"));
		
		JOptionPane.showMessageDialog(null, "Para fabricar " + quantidadeLatao + " quilos de Latão," 
		+ " você precisará de " + quantidadeLatao * 0.7 + " quilo(s) de Cobre e de " 
		+ quantidadeLatao * 0.3 + " quilo(s) de Zinco");

	}

}
