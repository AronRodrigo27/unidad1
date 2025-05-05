import java.util.Scanner ;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        System.out.print("ingrese numero 1: ");
        int a=m.nextInt();
        System.out.print("ingrese numero 2: ");
        int b=m.nextInt();
        System.out.print("ingrese numero 3: ");
        int c=m.nextInt();
        if (a>b&&a>c&&b>c){
        System.out.print(c );
        System.out.print(" "+ b );
        System.out.print(" "+ a );}
        else if(a>b&&a>c&&c>b){System.out.print(b );
            System.out.print(""+ c );
            System.out.print(""+ a );}
        else if(b>a&&b>c&&a>c){
            System.out.print(c );
            System.out.print(" "+ a );
            System.out.print(" "+ b );}
        else if(b>a&&b>c&&c>a){
            System.out.print(a );
            System.out.print(" "+ c);
            System.out.print(" "+ b );}
        else if (c>a&&c>b&&b>a){
            System.out.print(a );
            System.out.print(" "+ b);
            System.out.print(" "+ c );}
        else {System.out.print(b );
            System.out.print(" "+ a);
            System.out.print(" "+ c);
        }m.close();}}