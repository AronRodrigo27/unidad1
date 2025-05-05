import javax.swing.JOptionPane;

public class numero {
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
