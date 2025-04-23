public class Rectangle extends Shape {
  int width;
  int height;
Rectangle(int width, int height){
        this.width = width;
        this.height = height;
}

    @Override
    public double calculateArea() {
        return width * height;
    }
}
