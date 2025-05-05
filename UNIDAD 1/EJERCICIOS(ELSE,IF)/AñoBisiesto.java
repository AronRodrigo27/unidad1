import javax.swing.JOptionPane;
public class AñoBisiesto {
    public static void main(String[] args) {
        int año=Integer.parseInt(JOptionPane.showInputDialog("Introduce un año:"));
        if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
            JOptionPane.showMessageDialog(null, año + " es un año bisiesto.");
        } else {
            JOptionPane.showMessageDialog(null, año + " no es un año bisiesto.");
        }
    }
    
}
