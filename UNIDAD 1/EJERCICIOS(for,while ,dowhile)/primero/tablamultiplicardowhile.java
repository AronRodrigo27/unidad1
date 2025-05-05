import javax.swing.JOptionPane;
public class tablamultiplicardowhile {

    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        int i=1;
        do{
            int producto=1*n;
            System.out.println(n+"x"+i+"="+producto);
            i++;
        }while (i<=10);
            
        }
//ciertos casos
    }
