import java.util.List;
import java.util.ArrayList;
public class EvenNumberFilter {
    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>(numbers);
        evenNumbers.removeIf(n -> n % 2 != 0);
        return evenNumbers;
    }
    }

