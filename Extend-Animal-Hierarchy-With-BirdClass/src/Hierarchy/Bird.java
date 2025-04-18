package Hierarchy;

public class Bird extends Animal {

    String name;

    public Bird(String name) {
        this.name = name;
    }

    public void fly() {
        System.out.println(name + " does: "+ "Flying!");
    }


    @Override
    public void makeSound() {
        System.out.println(name + " say: " + "Chirp!");
    }
}