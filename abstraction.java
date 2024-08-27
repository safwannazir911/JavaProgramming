public class abstraction {

    static abstract class Animal {
        abstract void sound();

        void eat() {
            System.out.println("Eating...");
        }
    }

    static class Dog extends Animal {
        void sound() {
            System.out.println("Barking...");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }

}
