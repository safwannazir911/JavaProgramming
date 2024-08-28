public class nestedClasses {
    private String message = "Hello, World!";

    class InnerClass {
        void display() {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        nestedClasses outerClass = new nestedClasses();
        InnerClass inner = outerClass.new InnerClass();
        inner.display();
    }
}
