import javax.swing.JOptionPane;

public class InvertirNumero {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número:"));
        int i = 0;
        while (n != 0) {
            int digito = n % 10;
            i = i * 10 + digito;
            n /= 10;
        }
        JOptionPane.showMessageDialog(null, "Número invertido: " + i);
    }
}