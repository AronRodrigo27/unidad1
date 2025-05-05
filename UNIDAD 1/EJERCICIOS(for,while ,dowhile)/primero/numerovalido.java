import javax.swing.JOptionPane;
public class numerovalido {
    public static void main(String[] args) {
        int n;
        do{
            n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        }while(n<0);
    }

}

