import javax.swing.JOptionPane;
// Determina si una notas es excelente, bueno,suficiente o insuficiente entre 0 y 20
public class Notas {
    public static void main(String[] args) {
        double nota;
        String entrada = JOptionPane.showInputDialog("Introduce una nota entre 0 y 20:");
        nota = Double.parseDouble(entrada);
        if (nota >= 18 && nota <= 20) {
            JOptionPane.showMessageDialog(null, "La nota " + nota + " es excelente.");
        } else if (nota >= 14 && nota < 18) {
            JOptionPane.showMessageDialog(null, "La nota " + nota + " es buena.");
        } else if (nota >= 10 && nota < 14) {
            JOptionPane.showMessageDialog(null, "La nota " + nota + " es suficiente.");
        } else if (nota >= 0 && nota < 10) {
            JOptionPane.showMessageDialog(null, "La nota " + nota + " es insuficiente.");
        } else {
            JOptionPane.showMessageDialog(null, "La nota no es válida.");
        }
    }

    
}