package finalExamples;

public class finalVariable {
    public static class FinalVariableExample {
        final int MAX_AGE = 100;

        public void display() {
            // MAX_AGE = 200; // This will cause a compilation error
            System.out.println("Max age is: " + MAX_AGE);
        }
    }

    public static void main(String[] args) {
        FinalVariableExample example = new FinalVariableExample();
        example.display();
    }
}
