import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a map to store student data
        Map<Integer, String> students = new HashMap<>();

        // Add valid students
        StudentManager.addStudent(students, 301, "Gaju");
        StudentManager.addStudent(students, 101, "Queen");
        StudentManager.addStudent(students, 401, "Alice");
        StudentManager.addStudent(students, 201, "Hope");

        // Add invalid students (test negative ID, empty and null name)
        StudentManager.addStudent(students, -5, " ");
        StudentManager.addStudent(students, 500, null);

        // Sort students
        System.out.println("\nSorted Students:");
        StudentManager.sortStudent(students);

        // Search students
        System.out.println("\nSearching for ID 201:");
        StudentManager.searchStudent(students, 201);

        System.out.println("Searching for ID 99:");
        StudentManager.searchStudent(students, 99);

        // Remove students
        System.out.println("\nRemoving student with ID 101...");
        StudentManager.removeStudent(students, 101);

        System.out.println("Removing student with ID 999...");
        StudentManager.removeStudent(students, 999);

        // Add more students
        System.out.println("\nAdding more students...");
        StudentManager.addStudent(students, 200, "Charlie");
        StudentManager.addStudent(students, 150, "David");

        // Find student with highest ID
        System.out.println("Finding student with highest ID...");
        StudentManager.findStudentWithHighestId(students);

        // Find student with lowest ID
        System.out.println("Finding student with lowest ID...");
        StudentManager.findStudentWithLowestId(students);
    }
}
