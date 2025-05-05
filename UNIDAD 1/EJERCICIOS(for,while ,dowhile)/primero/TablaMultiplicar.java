import javax.swing.JOptionPane;
public class TablaMultiplicar {

    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        for(int i=1; i <=10; i=i+1 ){
            int producto=i*n;
            System.out.println(n+"x"+i+"="+producto);
// casi siempre
        }

    }
}