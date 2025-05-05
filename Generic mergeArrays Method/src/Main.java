public class Main {
    public static void main(String[] args) {

        Integer[] intArray1 = {184, 562, 63};
        Integer[] intArray2 = {4, 5, 6};

        Integer[] mergedInts = GenericArrayUtility.mergeArrays(intArray1, intArray2);
        System.out.print("Merged Integer Array: ");
        for (Integer num : mergedInts) {
            System.out.print(num + " ");
        }
        System.out.println();

        String[] strArray1 = {"Hello", "World"};
        String[] strArray2 = {"Java", "Generics"};

        String[] mergedStrings = GenericArrayUtility.mergeArrays(strArray1, strArray2);
        System.out.println("Merged String Array:");
        for (String word : mergedStrings) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
}