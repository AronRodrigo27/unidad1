
import javax.swing.JOptionPane;

public class radioesfera {
    public static void main(String[] args) {
        double r;
        r = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio:"));
        double v= (4.0 / 3.0)*Math.PI*Math.pow(r,3);
        JOptionPane.showMessageDialog(null,"El volumen de la esfera es: "+v);
    }
    
}
