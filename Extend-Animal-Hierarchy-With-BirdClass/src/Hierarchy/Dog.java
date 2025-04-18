package Hierarchy;
public class Dog extends Animal {
    Dog() {
        super("Dog");
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof woof!");
    }
}