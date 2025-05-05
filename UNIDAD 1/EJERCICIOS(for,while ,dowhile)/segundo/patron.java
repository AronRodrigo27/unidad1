import javax.swing.JOptionPane;

public class patron {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Número:"));
        String r = "";
        for (int i = 1; i <= n; i++, r += "*".repeat(i) + "\n");
        JOptionPane.showMessageDialog(null, r);
    }
}
