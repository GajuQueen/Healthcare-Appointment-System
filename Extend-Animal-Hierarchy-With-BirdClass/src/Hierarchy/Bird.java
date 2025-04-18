package Hierarchy;

public class Bird extends Animal {

    Bird(){
        super("Col");
    }
    public void fly() {
        System.out.println(name + " does: "+ "Flying!");
    }


    @Override
    public void makeSound() {
        System.out.println(name + " says: " + "Chirp!");
    }
}