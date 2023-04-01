package versao2;

import javax.swing.JOptionPane;

public class Principal {
	
	static String listaFilmes="Filmes adicionados na lista\n";
	
	public static void main(String[] args) {
		
	int opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos filmes deseja adicionar à lista"));
	
		for (int i=0; i<opcao; i++) {
			
			Filme filme = new Filme();
			
			JOptionPane.showMessageDialog(null, "Informe os dados do filme "+(i+1)+" que pretende adicionar");
			
			filme.setTitulo(JOptionPane.showInputDialog("Informe o nome do título"));
			filme.setDuracao(Integer.parseInt(JOptionPane.showInputDialog("Informe a duração em minutos")));
			filme.setGenero(JOptionPane.showInputDialog("Informe o gênero"));
			filme.setClassIndicativa(Integer.parseInt(JOptionPane.showInputDialog("Informe classificação indicativa")));	
			
			listaFilmes+= "\nFilme "+(i+1)+" adicionado:\n"+"Título "+filme.getTitulo()+" Duração "+filme.getDuracao()+
						  " Clasificação indicativa "+filme.getClassIndicativa()+" Gênero "+filme.getGenero();		
		}
		
		JOptionPane.showMessageDialog(null,listaFilmes);
		
	}

}
