package versao0;
import javax.swing.JOptionPane;

public class Principal {
	
	static String titulo;
	static int duracao;
	static String genero;
	static int classIndicativa;
	static String listaFilmes="Filme adicionados na lista\n";

	public static void main(String[] args) {
		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos filmes deseja adicionar à lista"));
		
		for (int i=0; i<opcao; i++) {
			
			JOptionPane.showMessageDialog(null, "Informe os dados do filme "+(i+1)+" que pretende adicionar");
			
			titulo = JOptionPane.showInputDialog("Informe o nome do título");
			duracao = Integer.parseInt(JOptionPane.showInputDialog("Informe a duração em minutos"));
			genero = JOptionPane.showInputDialog("Informe o gênero");
			classIndicativa = Integer.parseInt(JOptionPane.showInputDialog("Informe classificação indicativa"));	
			
			listaFilmes+= "\nFilme "+(i+1)+" adicionado:\n"+"Título "+titulo+" Duração "+duracao+
						  " Clasificação indicativa "+classIndicativa+" Gênero "+genero;		
		}
		
		JOptionPane.showMessageDialog(null,listaFilmes);

	}

}
