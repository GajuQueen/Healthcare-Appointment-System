package BoundedGenerics;
import java.util.ArrayList;
import java.util.List;

public class MainB {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(List.of(10, 20, 30, 5));
        List<Double> doubleList = new ArrayList<>(List.of(34.4, 20.2, 30.1, 5.9));
        List<Float> floatList = new ArrayList<>(List.of(10.0f, 20.0f, 30.0f));

        System.out.println(Maxfinder.firstMaximum(intList));
        System.out.println(Maxfinder.firstMaximum(doubleList));
        System.out.println(Maxfinder.firstMaximum(floatList));
    }
}
