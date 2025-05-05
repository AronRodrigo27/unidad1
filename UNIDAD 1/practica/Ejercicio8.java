import javax.swing.JOptionPane;


public class Ejercicio8 {
    public static void main(String[] args) {
        int i = 1, b, c = Integer.MIN_VALUE, d = Integer.MAX_VALUE;
        while (i <= 10) {
            b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número:"));
            if (c < b) c = b;
            if (d > b) d = b;
            i++;
        }
        System.out.println("El número mayor es " + c + " y el menor es: " + d);
        
    }
}
