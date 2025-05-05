import java.util.Scanner ;
public class ejercicio2 {

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
    System.out.print("ingrese cateto a: ");
    double b=a.nextDouble();
    
    System.out.print("ingrese cateto b: ");
    double c=a.nextDouble();
    double d=(Math.sqrt((Math.pow(b ,2))+(Math.pow(c ,2))));
    System.out.print("la hipotenusa es: "+d);
a.close();
    
    }}