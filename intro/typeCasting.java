class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class typeCasting {

    public static void main(String[] args) {
        int a = 10;
        double b = a; // Automatic type casting: int to double
        System.out.println(b); // Output: 10.0

        double x = 10.5;
        int y = (int) x; // Explicit type casting: double to int
        System.out.println(y); // Output: 10

        Animal animal = new Dog(); // Upcasting
        animal.makeSound(); // Output: Dog barks

        Dog dog = (Dog) animal; // Downcasting
        dog.makeSound(); // Output: Dog barks
    }
}
