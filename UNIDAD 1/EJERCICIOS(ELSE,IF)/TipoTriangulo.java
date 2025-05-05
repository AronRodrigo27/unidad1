import javax.swing.JOptionPane;

public class TipoTriangulo {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Lado a:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Lado b:"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Lado c:"));

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            JOptionPane.showMessageDialog(null, "Sí es un triángulo");

            if (a == b && b == c) {
                JOptionPane.showMessageDialog(null, "Equilátero");
            } else if (a != b && b != c && a != c) {
                JOptionPane.showMessageDialog(null, "Escaleno");
            } else {
                JOptionPane.showMessageDialog(null, "Isósceles");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No es un triángulo");
        }
    }
}
