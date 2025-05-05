public class ejercicio06 {

            public static void main(String[] args) {
                System.out.println(factorial(7));  // Salida: 5040
                System.out.println(factorial(10)); // Salida: 3628800
            }
        
            public static int factorial(int n) {
                if (n <= 1) {
                    return 1;
                }
                return n * factorial(n - 1);
            }
        }
        