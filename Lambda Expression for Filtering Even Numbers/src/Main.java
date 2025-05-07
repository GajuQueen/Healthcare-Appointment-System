import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
                List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
                List<Integer> evens1 = EvenNumberFilter.filterEvenNumbers(list1);
                System.out.println("Original List: " + list1);
                System.out.println("Even Numbers List: " + evens1);
                System.out.println();

                List<Integer> list2 = Collections.emptyList();
                List<Integer> evens2 = EvenNumberFilter.filterEvenNumbers(list2);
                System.out.println("Original List: " + list2);
                System.out.println("Even Numbers List: " + evens2);
                System.out.println();

                List<Integer> list3 = Arrays.asList(1, 3, 5, 7, 9);
                List<Integer> evens3 = EvenNumberFilter.filterEvenNumbers(list3);
                System.out.println("Original List: " + list3);
                System.out.println("Even Numbers List: " + evens3);
            }
        }
