
import javax.swing.JOptionPane;

public class promedio3numeros {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        a=Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el primer numero:"));
        b=Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el segundo numero:"));
        c=Integer.parseInt(JOptionPane.showInputDialog("ingrse el tercer numero: "));
        int suma=(a+b+c)/3;
        JOptionPane.showMessageDialog(null,"El promedio es: "+suma);
        
    }
    
}
