// Base class (or Parent class)
class Animal {
    // Method in the base class
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class (or Child class)
class Dog extends Animal {
    // Method overriding
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the base class
        Animal animal = new Animal();
        animal.makeSound(); // Output: Animal makes a sound

        // Creating an object of the derived class
        Dog dog = new Dog();
        dog.makeSound(); // Output: Dog barks
    }
}
