public class ejercicio07 {
    // Ejercicio 07: Número de Armstrong
        public static void main(String[] args) {
            System.out.println(isArmstrong(371));  // Salida: true
            System.out.println(isArmstrong(372));  // Salida: false
        }
    
        public static boolean isArmstrong(int num) {
            int sum = 0, temp, remainder, n = 0;
            temp = num;
            while (temp != 0) {
                temp /= 10;
                n++;
            }
            temp = num;
            while (temp != 0) {
                remainder = temp % 10;
                sum += Math.pow(remainder, n);
                temp /= 10;
            }
            return sum == num;
        }
    }
    

