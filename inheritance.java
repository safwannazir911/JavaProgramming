public class inheritance {
    // Inner class Animal
    public static class Animal {
        void eat() {
            System.out.println("Eating...");
        }
    }

    // Inner class Dog that extends Animal
    public static class Dog extends Animal {
        void bark() {
            System.out.println("Barking...");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
