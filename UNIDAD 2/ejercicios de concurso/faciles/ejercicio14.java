import java.util.ArrayList;
import java.util.List;

public class ejercicio14 {
    public static List<Integer> sort(List<Integer> lista, boolean asc) {
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                if ((asc && lista.get(i) > lista.get(j)) || (!asc && lista.get(i) < lista.get(j))) {
                    int temp = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, temp);
                }
            }
        }
        return lista;
    }
}
