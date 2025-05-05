public class ejercicio13 {

        public static void main(String[] args) {
            System.out.println(areOrthogonal(new int[]{1, 2}, new int[]{2, 1}));  // false
            System.out.println(areOrthogonal(new int[]{2, 1}, new int[]{-1, 2})); // true
        }
    
        public static boolean areOrthogonal(int[] vector1, int[] vector2) {
            int dotProduct = 0;
            for (int i = 0; i < vector1.length; i++) {
                dotProduct += vector1[i] * vector2[i];
            }
            return dotProduct == 0;
        }
    }
    

