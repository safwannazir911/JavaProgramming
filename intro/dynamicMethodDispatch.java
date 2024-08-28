public class dynamicMethodDispatch {
    static class Animal {
        void sound() {
            System.out.println("Animal sound");
        }
    }

    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Bark");
        }
    }

    static class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Meow");
        }
    }

    public static void main(String[] args) {
        Animal a;
        // JVM decides which method to invoke based on the actual object type at
        // runtime, rather than at compile-time.

        a = new Dog();
        a.sound(); // Outputs: Bark

        a = new Cat();
        a.sound(); // Outputs: Meow

        a = new Animal();
        a.sound();

    }
}
