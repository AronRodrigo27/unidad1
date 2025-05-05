import java.util.Scanner;

public class numerosecreto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = (int) (Math.random() * 100) + 1; // Número secreto entre 1 y 100
        int intento;
        boolean adivinado = false;

        System.out.println("¡Bienvenido al juego del número secreto!");
        System.out.println("Adivina el número entre 1 y 100:");

        while (!adivinado) {
            System.out.print("Introduce tu número: ");
            intento = scanner.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número secreto es menor.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número secreto.");
                adivinado = true;
            }
        }

        scanner.close();
    }
}