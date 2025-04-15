import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class WriteToFile {
    public static void main(String[] args) {
        String myName = "kjkjk";
        String fileName =  "myname.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            bw.write(myName);
            System.out.println("Written to file" + myName);
            bw.newLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
