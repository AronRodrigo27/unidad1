import javax.swing.*;

public class factorial {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        long f = 1;
        for (int i = 2; i <= n; f *= i++);
        JOptionPane.showMessageDialog(null, "Factorial de " + n + " es: " + f);
    }
}
