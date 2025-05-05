public class suamnumeroswhile {
    public static void main(String[] args) {
        int n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("ingrese un numero"));
        int a = 0;
        int i = 1; // Inicializar el contador
        while (i <= n) { // Condición del bucle
            a = a + i; // Sumar el número actual
            i++; // Incrementar el contador
        }
        System.out.println("la suma: " + a); // Imprimir la suma total
    }
}
