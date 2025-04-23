public class Circle extends Shape {
    int rad;
    Circle(int rad) {
        this.rad = rad;
    }
    public double calculateArea() {
        return Math.PI * rad * rad;
    }
}
