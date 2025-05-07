public class Cont  {
}
public class GenericSwapper {

    // Generic method to swap elements in an array
    public static <T> void swapElements(T[] array, int index1, int index2) {
        if (array == null || index1 >= array.length || index2 >= array.length || index1 < 0 || index2 < 0) {
            throw new IndexOutOfBoundsException("Invalid indices for the array.");
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    // Test the method
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "cherry"};
        swapElements(fruits, 0, 2); // Swaps "apple" and "cherry"

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}