
import javax.swing.JOptionPane;

public class sumadedosnumeros {
    public static void main(String[] args){
        int a;
        int b;
    a=Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el primer numero:"));
    b=Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el segundo numero:"));
    int suma=a+b;
    JOptionPane.showMessageDialog(null,"La suma es: "+suma);
    }
    
}
