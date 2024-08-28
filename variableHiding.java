public class variableHiding {
    static class Parent {
        private int x = 10;
    }

    static class Child extends Parent {
        int x = 20;

        void printX() {
            System.out.println(x); // Outputs 20
            System.out.println(super.x); // Outputs 10
        }
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.printX();

    }
}
