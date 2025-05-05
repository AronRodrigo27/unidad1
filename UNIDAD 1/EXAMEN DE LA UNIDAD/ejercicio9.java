import java.util.Scanner ;
public class ejercicio9 {

    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        int i=1;
        int b;
        int c=-999999999;
        int d=999999999;
        int e=0;
        while(i<=3){
            System.out.print("ingrese numero: ");
            b=m.nextInt();
            if (b!=c&&b!=d)
            {e=b;}
            if (c<b){
                c=b;}
            if (d>b){
                d=b;
            }
            
            
            i++;
    } 
    
    System.out.print(c + ""+ e + "" + d);

}}