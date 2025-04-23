public class Main {
    public static void main(String[] args) {
        Rectangle math1 = new Rectangle(6, 9);
        System.out.println("The area of a rectangle is " + math1.calculateArea());
        Circle math2 = new Circle(3);
        System.out.println("The area of a circle is " + math2.calculateArea());
    }
}