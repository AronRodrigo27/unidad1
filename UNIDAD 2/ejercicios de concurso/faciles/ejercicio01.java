// Ejercicio 01: FizzBuzz

public class ejercicio01 {
    public static void main(String[] args) {
        String[] array = new String[15];

        for (int i = 0; i < 15; i++) {
            int num = i + 1;
            if (num % 3 == 0 && num % 5 == 0)
                array[i] = "fizzbuzz";
            else if (num % 3 == 0)
                array[i] = "fizz";
            else if (num % 5 == 0)
                array[i] = "buzz";
            else
                array[i] = Integer.toString(num);
        }

        for (String s : array)
            System.out.print(s + " ");
    }
}
