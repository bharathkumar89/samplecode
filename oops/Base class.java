// Base class (or Superclass)
class Animal {
    // Method in the superclass
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class (or Subclass)
class Dog extends Animal {
    // Method in the subclass
    public void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the subclass
        Dog myDog = new Dog();
        
        // Call the methods from both the superclass and subclass
        myDog.eat();  // Method from the superclass
        myDog.bark(); // Method from the subclass
    }
}
