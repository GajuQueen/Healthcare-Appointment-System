package BoundedGenerics;
import java.util.List;

public class Maxfinder<T>{
    T content;
    public static <T extends Number & Comparable<T>> T firstMaximum(List<T> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        T max = list.get(0);
        for (T item : list) {
            if(item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}
