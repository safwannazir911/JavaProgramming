public class interfaceExample {
    static interface Animal {
        void sound();
    }

    static class Dog implements Animal {
        public void sound() {
            System.out.println("Bark");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Outputs: Bark

    }
}
