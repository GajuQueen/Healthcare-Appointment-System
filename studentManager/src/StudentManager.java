import java.util.Collections;
import java.util.TreeMap;
import java.util.Map;

public class StudentManager {

    public static void addStudent(Map<Integer, String> students, int studentId, String name) {
        try {
            if (studentId < 0 || name == null) {
                throw new InvalidStudentException("Error: Invalid student ID or name!");
            }
            students.put(studentId, name);
            System.out.println("Student added: ID = " + studentId + ", Name = " + name);
        } catch (InvalidStudentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Operation logged: Add Student");
        }
    }

    //    **************************************

    public static void sortStudent(Map<Integer, String> student) {
        try {
            TreeMap<Integer, String> sortedMap = new TreeMap<>(student);
            System.out.println("Sorted students:");
            for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
                System.out.println("ID: " + entry.getKey() + " → " + entry.getValue());
            }
        } finally {
            System.out.println("Operation logged: Sort Students");
        }
    }

    //        ************************************************
    public static void searchStudent(Map<Integer, String> students, int studentId) {
        try {
            if (students.containsKey(studentId)) {
                System.out.println("Student found: " + students.get(studentId));
            } else {
                System.out.println("Error: No student found with ID " + studentId);
            }
        } finally {
            System.out.println("Operation logged: Search Student");
        }
    }

    //    **************************************************************

    public static void removeStudent(Map<Integer, String> students, int studentId) {
        try {
            if (students.containsKey(studentId)) {
                students.remove(studentId);
                System.out.println("Student with ID " + studentId + " removed.");
            } else {
                System.out.println("Error: No student found with ID " + studentId);
            }
        } finally {
            System.out.println("Operation logged: Remove Student");
        }
    }

    //    ********************************************

    public static void findStudentWithHighestId(Map<Integer, String> students) {
        try {
            if (students.isEmpty()) {
                System.out.println("Error: No students available.");
                return;
            }
            int maxId = Collections.max(students.keySet());
            System.out.println("Student with highest ID: " + maxId + " → " + students.get(maxId));
        } finally {
            System.out.println("Operation logged: Find Highest ID");
        }
    }

    //    *****************************************************

    public static void findStudentWithLowestId(Map<Integer, String> students) {
        try {
            if (students.isEmpty()) {
                System.out.println("Error: No students available.");
                return;
            }
            int minId = Collections.min(students.keySet());
            System.out.println("Student with lowest ID: " + minId + " → " + students.get(minId));
        } finally {
            System.out.println("Operation logged: Find Lowest ID");
        }
    }
}
