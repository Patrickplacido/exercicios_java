import javax.swing.JOptionPane;

public class Exercicio09 {

	public static void main(String[] args) {
		
		int finalPlaca = Integer.parseInt(JOptionPane.showInputDialog("Digite o número final da placa do seu veículo (0 a 9):"));

        String mensagem = "Veículo não roda na ";
        switch (finalPlaca) {
        	case 0:
        		mensagem += "segunda-feira";
        		break;
            case 1: 
            	mensagem += "terça-feira";
            	break;
            case 2:
                mensagem += "quarta-feira";
                break;
            case 3:
            	mensagem += "quinta-feira";
            	break;
            case 4:
            	mensagem += "sexta-feira";
                break;
            case 5:
            	mensagem += "segunda-feira";
            	break;
            case 6:
                mensagem += "terça-feira";
                break;
            case 7:
            	mensagem += "quarta-feira";
            	break;
            case 8:
                mensagem += "quinta-feira";
                break;
            case 9:
                mensagem += "sexta-feira";
                break;
        }

        JOptionPane.showMessageDialog(null, mensagem);

	}

}
