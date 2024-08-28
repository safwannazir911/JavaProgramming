package finalExamples;

public class finalMethod {
    class Parent {
        final void display() {
            System.out.println("This is a final method.");
        }
    }

    class Child extends Parent {
        // void display() { // This would cause a compilation error
        // System.out.println("Trying to override the final method.");
        // }
    }

}
