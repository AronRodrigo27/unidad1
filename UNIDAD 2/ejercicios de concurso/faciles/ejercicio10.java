
    import java.util.ArrayList;

    public class ejercicio10 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 3, 4);
        List<Integer> list2 = List.of(2, 2, 3, 3, 3, 4, 6);
        
        System.out.println(calculateSet(list1, list2, true));  // Comunes
        System.out.println(calculateSet(list1, list2, false)); // No comunes
    }

    public static List<Integer> calculateSet(List<Integer> list1, List<Integer> list2, boolean common) {
        List<Integer> result = new ArrayList<>();
        for (Integer num1 : list1) {
            for (Integer num2 : list2) {
                if (num1.equals(num2)) {
                    if (common && !result.contains(num1)) {
                        result.add(num1);
                    } else if (!common && !result.contains(num1) && !list1.contains(num2)) {
                        result.add(num1);
                    }
                }
            }
        }
        return result;
    }
}


