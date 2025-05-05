
import javax.swing.JOptionPane;

public class arearectangulo{
    public static void main(String[] args) {
        int h;
        int b;
        h = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese la altura:"));
        b = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese la base:"));
        double a=h*b;
        JOptionPane.showMessageDialog(null,"el area es: "+a);
    }
}
