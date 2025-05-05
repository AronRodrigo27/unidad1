import javax.swing.JOptionPane;
public class numerosecreto {
    public static void main(String[] args) {
        
        int aleatorio=(int)((Math.random()*10)+1);
        int n;
        int intentos=0;
        System.out.print(aleatorio);
        do{
            n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
            intentos++;
            if(intentos==5){
                System.out.println(" usted perdio ");
            
            }
        }while(n!=aleatorio);
        if(aleatorio==n){
            System.out.println(" usted gano en " +intentos+ " intentos");
        }else{
            System.out.println("sigue intentando");
        }
        
    }

}

