package versao3;

public class Filme {

	private String titulo;
	private int duracao;
	private String genero;
	private int classIndicativa;
	
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getClassIndicativa() {
		return classIndicativa;
	}

	public void setClassIndicativa(int classIndicativa) {
		this.classIndicativa = classIndicativa;
	}
}