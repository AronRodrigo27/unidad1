import java.util.Scanner ;
public class ejercicio4 {

    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
    System.out.print("ingrese numero: ");
    int a=m.nextInt();
    for(int i=1;i<=10;i++){

        System.out.println(a+ "x" + i + "=" + a*i);
    }
    
    
    
    m.close();
    
    }}