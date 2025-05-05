import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer ángulo (alfa):"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo ángulo (beta):"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer ángulo (gamma):"));

        if (a + b + c == 180) {
            JOptionPane.showMessageDialog(null, "Los ángulos forman un triángulo.");
        } else {
            JOptionPane.showMessageDialog(null, "Los ángulos no forman un triángulo.");
        }
    }
}
