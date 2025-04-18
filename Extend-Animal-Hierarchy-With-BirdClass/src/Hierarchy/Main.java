package Hierarchy;

public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.makeSound();
        bird.fly();

        Animal Cat = new Cat();
        Animal dog = new Dog();

        bird.makeSound(); // Output: Bird says: Tweet tweet!
        dog.makeSound();
    }
}
