import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		
		String nomeDisciplina;
		double mediaFinal, frequencia;
		
		nomeDisciplina = JOptionPane.showInputDialog("Informe a disciplina");
		mediaFinal = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua media final na disciplina "
		+ nomeDisciplina));
		frequencia = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua media final em % na disciplina " 
		+ nomeDisciplina));
		
		if (mediaFinal >= 7.0  && frequencia >= 75) {
			JOptionPane.showMessageDialog(null, "Com media " + mediaFinal + " e frequencia " 
			+ frequencia + " % você esta APROVADO na disciplina de " + nomeDisciplina);
		}else {
			JOptionPane.showMessageDialog(null, "Com media " + mediaFinal + " e frequencia " 
			+ frequencia + " % você esta REPROVADO na disciplina de " + nomeDisciplina);
		}
		
	}

}
