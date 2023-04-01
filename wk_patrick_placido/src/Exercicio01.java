import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		
	    JOptionPane.showMessageDialog(null, "Digite 10 números inteiros:");

	    int v[] = new int [10];
	    int pares[] = new int[10];
	    int impares[] = new int[10];
	    int somaPar = 0;
	    int somaImpar = 0;

	    int contagemPares = 0, contagemImpares = 0;

	    for (int i = 0; i < 10; i++) {
	        v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor número " + (i+1) + ":"));
	        
	        if (v[i] % 2 == 0) {
	            pares[contagemPares] = v[i];
	            somaPar += pares[contagemPares];
	            contagemPares++;
	        } else {
	            impares[contagemImpares] = v[i];
	            somaImpar += impares[contagemImpares];
	            contagemImpares++;
	        }
	        
	    }
	    
	        JOptionPane.showMessageDialog(null, "Você digitou " + contagemPares + " numeros pares");
	        JOptionPane.showMessageDialog(null, "A soma dos pares é: " + somaPar);
	    
	    	JOptionPane.showMessageDialog(null, "Você digitou " + contagemImpares + " numeros impares");
	        JOptionPane.showMessageDialog(null, "A soma dos impares é: " + somaImpar);
	 
	}

}
