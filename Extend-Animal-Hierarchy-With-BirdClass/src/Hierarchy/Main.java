package Hierarchy;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.makeSound();
        bird.fly();

        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.makeSound();
        dog.makeSound();
    }
}
