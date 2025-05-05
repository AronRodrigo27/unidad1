import javax.swing.JOptionPane;
public class porcentaje {
    public static void main(String[] args) {
        double p,d;
        p=Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el precio:"));
        d=Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el descuento:"));
        double descuento=(p*d)/100;
        double preciofinal=p-descuento;
        JOptionPane.showMessageDialog(null,"El precio final es: "+preciofinal);
    }
    
}
