import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        StudentManager.addStudent(students, 301, "Gaju");
        StudentManager.addStudent(students, 101, "Queen");
        StudentManager.addStudent(students, 401, "Alice");
        StudentManager.addStudent(students, 201, "Hope");
        StudentManager.addStudent(students, -5, " ");
        StudentManager.sortStudent(students);
        System.out.println("\nSearching for ID 2:");
        StudentManager.searchStudent(students, 2);

        System.out.println("Searching for ID 99:");
        StudentManager.searchStudent(students, 99);

        System.out.println("\nRemoving student with ID 101...");
        StudentManager.removeStudent(students, 101);

        // Try to remove a student that doesn't exist
        System.out.println("\nRemoving student with ID 999...");
        StudentManager.removeStudent(students, 999);

        System.out.println("\nAdding more students...");
        StudentManager.addStudent(students, 200, "Charlie");
        StudentManager.addStudent(students, 150, "David");

        // Find the student with the highest ID
        System.out.println("\nFinding student with highest ID...");
        StudentManager.findStudentWithHighestId(students);


    }
}