//Question 15
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ArrayList{
    public static void main(String[] args) {
        String fileName = "example.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
