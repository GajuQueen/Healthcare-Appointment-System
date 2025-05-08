import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CSVStreamProcessor {
        public static double calculateAverageAge(String csvFilePath) throws IOException {
            try (Stream<String> lines = Files.lines(Paths.get(csvFilePath))) {
                return lines
                        .skip(1) // Skip header
                        .map(line -> {
                            String[] parts = line.split(",");
                            if (parts.length < 2) return null; // Malformed line
                            try {
                                return Integer.parseInt(parts[1].trim());
                            } catch (NumberFormatException e) {
                                return null; // Invalid age format
                            }
                        })
                        .filter(age -> age != null) // Remove invalid/null entries
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0.0); // If no valid ages found
            }
        }

        public static void main(String[] args) {
            String csvPath = "people.csv"; // Adjust the path if needed
            try {
                double averageAge = calculateAverageAge(csvPath);
                System.out.println("Average Age: " + String.format("%.2f", averageAge));
            } catch (IOException e) {
                System.out.println("Error reading the file: " + e.getMessage());
            }
        }
    }

