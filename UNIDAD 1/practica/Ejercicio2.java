import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        double a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cateto a:"));
        double b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cateto b:"));
        double hipotenusa = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        JOptionPane.showMessageDialog(null, String.format("La hipotenusa es: %.2f", hipotenusa));
    }}