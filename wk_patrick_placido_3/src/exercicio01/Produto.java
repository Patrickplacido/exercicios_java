package exercicio01;

import javax.swing.JOptionPane;

public class Produto {

	public String descricao;
	public float preco;
	public String categoria;
	public float peso;
	public int codigoCategoria;
	public Marca marca = new Marca();
	
	public void cadastrarProduto() {
		
		this.descricao = JOptionPane.showInputDialog("Digite o nome do produto:");
		this.categoria = JOptionPane.showInputDialog("Digite o nome da categoria produto:");
		this.codigoCategoria = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da categoria:"));
		this.marca.setarMarca(JOptionPane.showInputDialog("Digite a marca do produto:"));
		this.preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do produto:"));
		this.peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso do produto (Kg):"));
		
	} 
	
	public void mostrarProduto() {
		
		JOptionPane.showMessageDialog(null, String.format("Descrição: %s\n"
				+ "Categoria: %s\n"
				+ "Cod. Categoria: %d\n"
				+ "Marca: %s\n"
				+ "Preço: R$ %.2f\n"
				+ "Peso: %.2f Kg\n", 
				this.descricao,
				this.categoria,
				this.codigoCategoria,
				this.marca.nome,
				this.preco,
				this.peso));
		
	}
}
