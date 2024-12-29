package test;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }
    public static void makeSound() {
        System.out.println("Dog makes sound");
    }

    public static void main(String[] args) {
        Animal dog = new Dog("Dog");
        dog.makeSound();
    }

}
