import java.util.Arrays;
public class ejercicio20 {

        public static void main(String[] args) {
            int[] array = {5, 1, 8, 4, 2};
            bubbleSort(array);
            System.out.println(Arrays.toString(array));  // Salida: [1, 2, 4, 5, 8]
        }
    
        public static void bubbleSort(int[] array) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
    }
    
