import java.util.Scanner ;
public class ejercicio1 {

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("ingrese cantidad de kilometros: ");
        double b=a.nextDouble();
        double c=b*0.621371;
        System.out.print("la cantidad en millas es: "+c +"millas");
        a.close();
    }
}