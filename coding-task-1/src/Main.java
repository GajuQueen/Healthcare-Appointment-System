import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your guess:");
        int secretnumber = 60;
        double attempt = 0;
        for (; ; ) {
            int guessnbr = scanner.nextInt();
            attempt++;
            if (guessnbr > secretnumber) {
                System.out.println("TOO HIGH");
            } else if (guessnbr < secretnumber) {
                System.out.println("TOO LOW");
            } else {
                System.out.println("CORRECT");
                System.out.println("Total attempts:" + attempt);
                break;
            }
        }
    }
}