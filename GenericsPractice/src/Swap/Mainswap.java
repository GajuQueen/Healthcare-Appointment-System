package Swap;
import java.util.ArrayList;
import java.util.List;
public class Mainswap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Hope", "Queen", "Sonia"));
        System.out.println("Before swap: " + list);

        Swap.swapElements(list, 0, 1);
        System.out.println("After swap: " + list);
    }
}
