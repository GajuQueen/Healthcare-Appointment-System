public class GradeManager {
        private int[] grades;
        private int size;

        public GradeManager() {
            grades = new int[5]; // Initial size
            size = 0;
        }

        public void addGrade(int grade) throws InvalidGradeException {
            if (grade < 0) {
                throw new InvalidGradeException("Error: Invalid grade!");
            }

            if (size == grades.length) {
                int[] newGrades = new int[grades.length * 2];
                for (int i = 0; i < grades.length; i++) {
                    newGrades[i] = grades[i];
                }
                grades = newGrades;
            }

            grades[size] = grade;
            size++;
        }

        public void sortGrades() {
            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (grades[i] > grades[j]) {
                        int temp = grades[i];
                        grades[i] = grades[j];
                        grades[j] = temp;
                    }
                }
            }
        }

        public int searchGrade(int target) {
            for (int i = 0; i < size; i++) {
                if (grades[i] == target) {
                    return i;
                }
            }
            return -1;
        }

        public double calculateAverage() {
            if (size == 0) return 0;
            int sum = 0;
            for (int i = 0; i < size; i++) {
                sum += grades[i];
            }
            return (double) sum / size;
        }

        public int findHighestGrade() {
            if (size == 0) return -1;
            int max = grades[0];
            for (int i = 1; i < size; i++) {
                if (grades[i] > max) {
                    max = grades[i];
                }
            }
            return max;
        }

        public int findLowestGrade() {
            if (size == 0) return -1;
            int min = grades[0];
            for (int i = 1; i < size; i++) {
                if (grades[i] < min) {
                    min = grades[i];
                }
            }
            return min;
        }

        public int[] getGrades() {
            int[] result = new int[size];
            for (int i = 0; i < size; i++) {
                result[i] = grades[i];
            }
            return result;
        }
    }

