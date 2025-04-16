//import java.util.HashMap;
import java.util.Collections;
import java. util.TreeMap;
import java.util.Map;

public class StudentManager {

    public static void addStudent(Map<Integer, String> students, int studentId, String name) {
        try {
            if (studentId < 0 || name == null) {
                throw new IllegalArgumentException("Error: Invalid student ID or name!");
            }
            students.put(studentId, name);
            System.out.println("Student added: ID = " + studentId + ", Name = " + name);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Operation logged: Add Student");
        }
    }


//    **************************************


    public static void sortStudent(Map<Integer, String> student) {
        // Create a TreeMap which sorts
        TreeMap<Integer, String> sortedMap = new TreeMap<>(student);
        // Print
        System.out.println("Sorted students:");
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " → " + entry.getValue());
        }
    }

    //        ************************************************
    public static void searchStudent(Map<Integer, String> students, int studentId) {
        if (students.containsKey(studentId)) { // Check if student exists
            System.out.println("Student found: " + students.get(studentId));
        } else {
            System.out.println("Error: No student found with ID " + studentId);
        }
    }

//    **************************************************************


    public static void removeStudent(Map<Integer, String> students, int studentId) {
        // Remove a student by ID
        if (students.containsKey(studentId)) {
            students.remove(studentId); // Remove the student
            System.out.println("Student with ID " + studentId + " removed.");
        } else {
            System.out.println("Error: No student found with ID " + studentId);
        }
    }

//    ********************************************8

    public static void findStudentWithHighestId(Map<Integer, String> students) {
        if (students.isEmpty()) {
            System.out.println("Error: No students available.");
            return;
        }
        int maxId = Collections.max(students.keySet()); // Get the highest ID
        System.out.println("Student with highest ID: " + maxId + " → " + students.get(maxId));
    }

//    *****************************************************


    public static void findStudentWithLowestId(Map<Integer, String> students) {
            if (students.isEmpty()) {
                System.out.println("Error: No students available.");
                return;
            }
            int minId = Collections.min(students.keySet()); // Get the lowest ID
            System.out.println("Student with lowest ID: " + minId + " → " + students.get(minId));
        }
    }

