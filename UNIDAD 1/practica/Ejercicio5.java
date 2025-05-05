import javax.swing.JOptionPane;


public class Ejercicio5 {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese número:"));
        double suma = 0;
        for (int i = 1; i <= a; i++) suma += i;
        System.out.println("El promedio aritmético es: " + (suma / a));

    }
}
