import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Número:"));
        for (int i = 1; i <= 10; i++)
            System.out.println(a + " x " + i + " = " + (a * i));
     
    }
}
