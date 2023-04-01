import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {

        double temperaturaFahrenheit = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a temperatura em Fahrenheit:"));

        double temperaturaC = 5 * (temperaturaFahrenheit - 32) / 9;

        JOptionPane.showMessageDialog(null, temperaturaFahrenheit + "º F equivalem a " 
        + temperaturaC + "º C");
    }

}
