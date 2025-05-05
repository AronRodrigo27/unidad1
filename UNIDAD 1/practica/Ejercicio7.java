import javax.swing.JOptionPane;


public class Ejercicio7 {
    public static void main(String[] args) {
        int a, b, c;
        do {
            a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer número (0 para salir):"));
            if (a == 0) break;
            b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo número (0 para salir):"));
            if (b == 0) break;
            c = a + b;
            System.out.println("La suma es: " + c);
        } while (a != 0);

    }
}
