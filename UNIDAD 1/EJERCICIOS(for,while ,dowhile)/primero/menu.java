import javax.swing.JOptionPane;
public class menu {
    public static void main(String[] args) {
    
        int opciones;
        
        do{
            opciones=Integer.parseInt(JOptionPane.showInputDialog("1. SALUDAR\n2. mostrar FECHA\n3.SALIR"));
            if (opciones==1)
                JOptionPane.showMessageDialog(null, "hola,como estas");
            else if (opciones==2)
                JOptionPane.showMessageDialog(null, "07/04/2025");
            else if (opciones!=3)
                JOptionPane.showMessageDialog(null, "opcion invalida");
        
        }while(opciones!=3);

    }
}