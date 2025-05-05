import javax.swing.JOptionPane;
public class edades {
    public static void main(String[] args) {
        int edad;
        String entrada = JOptionPane.showInputDialog("Introduce tu edad:");
        edad = Integer.parseInt(entrada);
        if (edad >= 0 && edad <= 12) {
            JOptionPane.showMessageDialog(null, "Eres un niño.");
        } else if (edad >= 13   && edad <= 19) {
            JOptionPane.showMessageDialog(null, "Eres un adolescente.");
        } else if (edad >= 20  && edad <= 64) {
            JOptionPane.showMessageDialog(null, "Eres un adulto.");
        } else if (edad >= 65 && edad <= 120) {
            JOptionPane.showMessageDialog(null, "Eres un adulto mayor.");
        } else {
            JOptionPane.showMessageDialog(null, "Edad no válida.");
        }
    }
    
}
