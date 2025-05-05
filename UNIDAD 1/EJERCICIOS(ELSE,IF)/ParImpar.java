import javax.swing.JOptionPane;
// Determina si un número es par o impar
public class ParImpar {
    public static void main(String[] args) {
        int numero;
        String entrada = JOptionPane.showInputDialog("Introduce un número entero:");
        numero = Integer.parseInt(entrada);
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El número " + numero + " es par.");
        } else {
            JOptionPane.showMessageDialog(null, "El número " + numero + " es impar.");
        }
    }
}

      