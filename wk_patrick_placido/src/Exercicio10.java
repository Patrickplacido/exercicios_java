import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {
		
		int[] votos = new int[3];

        for (int i = 1; i <= 20; i++) {
        	
            int voto = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do candidato que você pretende votar:"));
            int candidato;
            
            if (voto == 88) {
            	candidato = 0;
            }else if (voto == 95) {
            	candidato = 1;
            }else if (voto == 23) {
            	candidato = 2;
            }else {
            	candidato = -1;
            }

            if (candidato >= 0 && candidato <= 2) {
                votos[candidato]++;
            } else {
                JOptionPane.showMessageDialog(null, "Candidato inválido. Voto não computado");
            }
        }

        String resultado = "Resultado da votação:\n";
        for (int i = 0; i < votos.length; i++) {
            resultado += "Candidato " + (i+1) + ": " + votos[i] + " votos\n";
        }

        int maxVotos = votos[0];
        int candidatoFavorito = 1;
        boolean empate = false;
        for (int i = 1; i < votos.length; i++) {
            if (votos[i] > maxVotos) {
                maxVotos = votos[i];
                candidatoFavorito = i + 1;
                empate = false;
            } else if (votos[i] == maxVotos) {
                empate = true;
            }
        }

        if (empate) {
            resultado += "Houve um empate entre os candidatos com " + maxVotos + " votos.";
        } else {
            resultado += "O candidato " + candidatoFavorito + " foi o mais votado, com " + maxVotos + " votos.";
        }

        JOptionPane.showMessageDialog(null, resultado);

	}

}
