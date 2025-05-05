import javax.swing.JOptionPane;
public class contardigitosdeunnumero {
    public static void main(String[] args){
    int n;
    int c=0;
    n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
    while (n!=0){
        n=n/10;
        c++;
    JOptionPane.showMessageDialog(null,"el numero de digitos es"+c);
    }
    
}
}
