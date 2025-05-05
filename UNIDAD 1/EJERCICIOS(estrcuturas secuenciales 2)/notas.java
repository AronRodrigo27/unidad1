
import javax.swing.JOptionPane;

//suma de 5 notas del 0 a 20 y promediar las 5 notas
public class notas {
public static void main(String[] args) {
    int a,b,c,d,e;
  
    a=Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese la primera nota:"));
    b=Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese la segunda nota:"));          
    c=Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese la tercera nota:"));
    d=Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese la cuarta nota:"));
    e=Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese la quinta nota:"));
    int s=(a+b+c+d+e)/5;
    JOptionPane.showMessageDialog(null,"El promedio es: "+s);

}    
}
