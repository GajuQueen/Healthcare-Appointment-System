public class Main {
    public static void main(String[] args) {
        GradeManager manager = new GradeManager();

        try {
            manager.addGrade(85);
            manager.addGrade(90);
            manager.addGrade(75);
            System.out.println("Grades added successfully.");
        } catch (InvalidGradeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Operation logged: add valid grades.");
        }

        try {
            manager.addGrade(-10); // Invalid
        } catch (InvalidGradeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Operation logged: add invalid grade.");
        }

        try {
            manager.sortGrades();
            System.out.print("Sorted grades: ");
            for (int grade : manager.getGrades()) {
                System.out.print(grade + " ");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Error while sorting grades.");
        } finally {
            System.out.println("Operation logged: sort grades.");
        }

        try {
            int index = manager.searchGrade(90);
            if (index != -1) {
                System.out.println("Grade 90 found at index: " + index);
            } else {
                System.out.println("Grade 90 not found.");
            }
        } finally {
            System.out.println("Operation logged: search grade.");
        }

        try {
            double avg = manager.calculateAverage();
            System.out.println("Average grade: " + avg);
        } finally {
            System.out.println("Operation logged: calculate average.");
        }

        try {
            int max = manager.findHighestGrade();
            System.out.println("Highest grade: " + max);
        } finally {
            System.out.println("Operation logged: find highest grade.");
        }

        try {
            int min = manager.findLowestGrade();
            System.out.println("Lowest grade: " + min);
        } finally {
            System.out.println("Operation logged: find lowest grade.");
        }

        // Access out-of-bounds index
        try {
            int[] grades = manager.getGrades();
            System.out.println("Accessing out-of-bounds index: " + grades[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Tried to access an invalid index!");
        } finally {
            System.out.println("Operation logged: out-of-bounds access.");
        }
    }
}
