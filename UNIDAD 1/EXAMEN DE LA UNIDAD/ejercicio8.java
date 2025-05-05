import java.util.Scanner ;
public class ejercicio8 {

    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
    int i=1;
    int b;
    int c=-999999999;
    int d=999999999;
    while(i<=10){
        System.out.print("ingrese numero: ");
        b=m.nextInt();
        if (c<b){
            c=b;}
        if (d>b){
            d=b;
        }
        i++;
    }System.out.print("el numero mayor es " +c +" y el menor es: "+ d);m.close();
    }}