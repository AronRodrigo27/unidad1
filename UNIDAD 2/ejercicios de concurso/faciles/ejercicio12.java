public class ejercicio12 {

        public static void main(String[] args) {
            drawPolygon(5, "CUADRADO");
            drawPolygon(5, "TRIANGULO");
        }
    
        public static void drawPolygon(int size, String type) {
            if (type.equalsIgnoreCase("CUADRADO")) {
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            } else if (type.equalsIgnoreCase("TRIANGULO")) {
                for (int i = 1; i <= size; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
    }
    

