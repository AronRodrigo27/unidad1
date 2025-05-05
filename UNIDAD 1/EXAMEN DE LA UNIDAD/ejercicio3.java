import java.util.Scanner ;
public class ejercicio3 {

    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
    System.out.print("ingrese angulo alfa: ");
    int a=m.nextInt();
    System.out.print("ingrese angulo beta: ");
    int b=m.nextInt();
    System.out.print("ingrese angulo gama: ");
    int c=m.nextInt();
    if (a+b+c==180){
System.out.print("es un triangulo :)");


    }else {
        System.out.print("no es un triangulo :(");
    }

    
    
    
    m.close();
    }}