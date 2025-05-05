import java.util.Scanner ;
public class ejercicio7 {

    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        int a;
        int b;
        int c;
    do {System.out.println("suma de 2 numeros");
        System.out.print("ingrese primer numero: ");
        a=m.nextInt();if(a==0){
            break;
        }

        
        System.out.print("ingrese segundo numero: ");
        
        b=m.nextInt();if(b==0){
            break;
        }
        c=a+b;
        System.out.println("la suma es: "+c);

}while(a!=0);
m.close();
    
    
    
    }}