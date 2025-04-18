package Hierarchy;
public class Cat extends Animal {
    Cat() {
        super("Cat");
    }

    @Override
    void makeSound() {
        System.out.println(name + " says:  meow meow!");
    }
}