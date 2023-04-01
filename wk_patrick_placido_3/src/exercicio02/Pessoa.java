package exercicio02;

import javax.swing.JOptionPane;

public class Pessoa {

	public String nome;
	public String nacionalidade;
	public int idade;
	
	public Pessoa(String nome, String nacionalidade, int idade) {
		
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		
	}
	
	
	public void mostrarPessoa() {
		
		JOptionPane.showMessageDialog(null, String.format("Nome: %s\n"
				+ "Idade: %d\n"
				+ "Nacionalidade: %s\n",
				this.nome,
				this.idade,
				this.nacionalidade));
		
	}
}
