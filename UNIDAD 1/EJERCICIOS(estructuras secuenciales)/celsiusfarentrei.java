
import javax.swing.JOptionPane;

public class celsiusfarentrei{
    public static void main(String[] args) {
        double c;
        c = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese la temperatura en Celsius:"));
        double f=(c*9/5)+32;
        JOptionPane.showMessageDialog(null,"La temperatura en Fahrenheit es: "+f);
        
    }
}