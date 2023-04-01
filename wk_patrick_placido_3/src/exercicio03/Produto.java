package exercicio03;

public class Produto {

	private String descricao;
	private float preco;
	private String categoria;
	private float peso;
	private int codigoCategoria;
	private Marca marca = new Marca();
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getCodigoCategoria() {
		return codigoCategoria;
	}

	public void setCodigoCategoria(int codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
	}

	public String getMarca() {
		return marca.getNome();
	}

	public void setMarca(String string) {
		this.marca.setNome(string);
	}

}
