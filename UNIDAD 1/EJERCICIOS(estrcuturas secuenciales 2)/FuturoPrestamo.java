import javax.swing.JOptionPane;

public class FuturoPrestamo {

    public static void main(String[] args) {
        double a,b,c;  
        a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor actual: "));
        b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la tasa de interés (en porcentaje): "));
        c=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de períodos: "));

        
        double valorFuturo = a * Math.pow((1 + b * 0.01), c); 
       
        JOptionPane.showMessageDialog(null, "El valor futuro es: " + valorFuturo);
    }
}
