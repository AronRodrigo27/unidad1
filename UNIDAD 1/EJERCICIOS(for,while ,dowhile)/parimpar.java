
import javax.swing.JOptionPane;

public class parimpar {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        if(n%2==0){
            JOptionPane.showMessageDialog(null,"El número es par");
        }else{  
            JOptionPane.showMessageDialog(null,"El número es impar");
        }
    }
    
}
