import java.util.*;

public class ejercicio19 {
    
    public static List<Character> mostRepeatedVowel(String text) {
        int[] vowels = new int[5]; // a e i o u
        text = text.toLowerCase();
        for (char c : text.toCharArray()) {
            switch (c) {
                case 'a' -> vowels[0]++;
                case 'e' -> vowels[1]++;
                case 'i' -> vowels[2]++;
                case 'o' -> vowels[3]++;
                case 'u' -> vowels[4]++;
            }
        }

        int max = Arrays.stream(vowels).max().orElse(0);
        List<Character> result = new ArrayList<>();
        if (max == 0) return result;

        char[] voc = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vowels.length; i++) {
            if (vowels[i] == max) result.add(voc[i]);
        }
        return result;
    }
}
  