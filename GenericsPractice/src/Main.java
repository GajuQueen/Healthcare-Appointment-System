public class Main {
    public static void main(String[] args) {
        Box<String> string = new Box<>();
        string. setContent("Yoo Jesus loves you");
        Box<Integer> integer = new Box<>();
        integer. setContent(1);
        Box<Double> double1 = new Box<>();

        System.out.println(string.getContent());
        System.out.println(integer.getContent());
        System.out.println(double1.getContent());

        System.out.println(string.isPresent());
        System.out.println(double1.isPresent());
        System.out.println(integer.isPresent());
    }
}