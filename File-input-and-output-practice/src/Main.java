import java.io.*;

public class Main {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\gajuq\\Documents\\SheCanCode Tasks\\File-input-and-output-practice\\src\\firstname.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(fileLocation))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}