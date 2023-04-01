package versao1;

import javax.swing.JOptionPane;

public class Principal {
	
	static String listaFilmes="Filmes adicionados na lista\n";
	
	public static void main(String[] args) {
		
	int opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos filmes deseja adicionar à lista"));
	
		for (int i=0; i<opcao; i++) {
			
			Filme filme = new Filme();
			
			JOptionPane.showMessageDialog(null, "Informe os dados do filme "+(i+1)+" que pretende adicionar");
			
			filme.titulo = JOptionPane.showInputDialog("Informe o nome do título");
			filme.duracao = Integer.parseInt(JOptionPane.showInputDialog("Informe a duração em minutos"));
			filme.genero = JOptionPane.showInputDialog("Informe o gênero");
			filme.classIndicativa = Integer.parseInt(JOptionPane.showInputDialog("Informe classificação indicativa"));	
			
			listaFilmes+= "\nFilme "+(i+1)+" adicionado:\n"+"Título "+filme.titulo+" Duração "+filme.duracao+
						  " Clasificação indicativa "+filme.classIndicativa+" Gênero "+filme.genero;		
		}
		
		JOptionPane.showMessageDialog(null,listaFilmes);
		
	}

}
