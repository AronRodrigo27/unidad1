import java.util.Scanner;

public class ejercicio04 {

    public static String convertirABinario(int numero) {
        if (numero == 0) return "0";

        String binario = "";
        while (numero > 0) {
            int residuo = numero % 2;
            binario = residuo + binario; // construir el binario desde el último dígito hacia el primero
            numero = numero / 2;
        }
        return binario;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número decimal: ");
        int decimal = scanner.nextInt();

        String binario = convertirABinario(decimal);
        System.out.println("El número en binario es: " + binario);
    }
}
