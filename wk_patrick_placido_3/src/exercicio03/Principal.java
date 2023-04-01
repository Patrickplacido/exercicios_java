package exercicio03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		
		produto.setDescricao(JOptionPane.showInputDialog("Digite o nome do produto:"));
		produto.setCategoria(JOptionPane.showInputDialog("Digite o nome da categoria produto:"));
		produto.setCodigoCategoria(Integer.parseInt(JOptionPane.showInputDialog("Digite o código da categoria:")));
		produto.setMarca(JOptionPane.showInputDialog("Digite a marca do produto:"));
		produto.setPreco(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do produto:")));
		produto.setPeso(Float.parseFloat(JOptionPane.showInputDialog("Digite o peso do produto (Kg):")));
		
		JOptionPane.showMessageDialog(null, String.format("Descrição: %s\n"
				+ "Categoria: %s\n"
				+ "Cod. Categoria: %d\n"
				+ "Marca: %s\n"
				+ "Preço: R$ %.2f\n"
				+ "Peso: %.2f Kg\n", 
				produto.getDescricao(),
				produto.getCategoria(),
				produto.getCodigoCategoria(),
				produto.getMarca(),
				produto.getPreco(),
				produto.getPeso()));
		
	}

	
	
}
