public class suamnumerosdowhile {
    public static void main(String[] args) {
        int n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese un numero"));
        int a = 0;
        int i = 1; // Inicializar el contador
        do {
            a = a + i; // Sumar el número actual
            i++; // Incrementar el contador
        } while (i <= n); // Condición del bucle
        System.out.println("La suma: " + a); // Imprimir la suma total
    }
    
}
