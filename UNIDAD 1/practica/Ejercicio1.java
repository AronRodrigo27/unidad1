import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Ingrese cantidad de kilómetros:");
        double b = Double.parseDouble(a);
        double c = b * 0.621371;
        JOptionPane.showMessageDialog(null, "La cantidad en millas es: " + c + " millas");
    }
}
