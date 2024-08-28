public class methodOverriding {
    static class Parent {
        void display() {
            System.out.println("Parent class");
        }
    }

    static class Child extends Parent {
        @Override
        void display() {
            System.out.println("Child class");
        }
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.display(); // Outputs: Child class
    }
}
