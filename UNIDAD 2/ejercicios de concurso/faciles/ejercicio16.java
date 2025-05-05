import java.util.List;

public class ejercicio16 {
    public static Integer findSecondGreater(List<Integer> lista) {
        Integer max = null, second = null;
        for (Integer n : lista) {
            if (max == null || n > max) {
                second = max;
                max = n;
            } else if ((second == null || n > second) && !n.equals(max)) {
                second = n;
            }
        }
        return second;
    }
}
