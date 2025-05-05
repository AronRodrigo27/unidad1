import javax.swing.JOptionPane;
public class suamsnumerosfor {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        
        int a=0;
        for(int i=1;i<=n ;i++){
        a=a+i;
            
        }
        System.out.println("la suma: "+a);

        

    }
}

