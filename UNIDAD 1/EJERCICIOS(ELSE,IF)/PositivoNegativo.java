import javax.swing.JOptionPane;
// Determina si un número es positivo , negativo o cero
public class PositivoNegativo {
    public static void main(String[] args) {
        double numero;
        String entrada = JOptionPane.showInputDialog("Introduce un número:");
        numero = Double.parseDouble(entrada);
        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "El número " + numero + " es positivo.");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "El número " + numero + " es negativo.");
        } else {
            JOptionPane.showMessageDialog(null, "El número es cero.");
        }
    }
    
}
