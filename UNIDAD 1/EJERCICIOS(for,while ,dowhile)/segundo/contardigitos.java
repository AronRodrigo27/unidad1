public class contardigitos {
    public static void main(String[] args) {
        int n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese un numero:"));
        int contador = 0; // Inicializar el contador de dígitos

        // Contar los dígitos del número
        while (n != 0) {
            n = n / 10; // Dividir el número por 10
            contador++; // Incrementar el contador
        }

        // Mostrar el resultado
        System.out.println("El número de dígitos es: " + contador);
    }
}
