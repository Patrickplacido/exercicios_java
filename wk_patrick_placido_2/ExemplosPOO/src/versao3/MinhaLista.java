package versao3;

import java.util.ArrayList;

public class MinhaLista {

	private ArrayList<Filme> listaFilmes = new ArrayList<Filme>();
	
	public void adicionarFilme(Filme filme) {
		this.listaFilmes.add(filme);
	}
	
	public String mostrarFilme() {
		String todosOsFilmes = "Filmes adicionados\n";
		
		for (Filme f : this.listaFilmes) {
			todosOsFilmes += "Título" + f.getTitulo() + "\n" +
					"Duração" + f.getDuracao() + "\n" +
					"Gênero" + f.getGenero() + "\n" +
					"Classifição Indicativa" + f.getClassIndicativa() + "\n";
		}
				
		return todosOsFilmes;
	}
	
}
