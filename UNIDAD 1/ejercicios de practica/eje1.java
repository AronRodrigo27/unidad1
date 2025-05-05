
import javax.swing.JOptionPane;

public class eje1 {
    public static void main(String[] args) {
        double a=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));
        if (a==2) {
            JOptionPane.showMessageDialog( null, "es veradero"); 
        }else if(a>2){
            JOptionPane.showMessageDialog( null, "es falso");
        }else if(a<2){
            JOptionPane.showMessageDialog( null, "es falso");
        }
    }

    
}
