public class Main {
    public static void main(String[] args) {
        NumberPair<Integer, Double> pair1 = new NumberPair<>(5, 4.5);
        System.out.println("Pair: " + pair1);
        System.out.println("Sum: " + pair1.sum(2, 5));
        System.out.println("Product: " + pair1.product());

        NumberPair<Float, Long> pair2 = new NumberPair<>(3.5f, 6L);
        System.out.println("Pair: " + pair2);
        System.out.println("Sum: " + pair2.sum());
        System.out.println("Product: " + pair2.product())

    }
}