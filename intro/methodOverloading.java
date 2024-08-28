public class methodOverloading {
    static class MathOperations {
        int add(int a, int b) {
            return a + b;
        }

        int add(int a, int b, int c) {
            return a + b + c;
        }
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println(math.add(5, 10)); // Outputs: 15
        System.out.println(math.add(5, 10, 15)); // Outputs: 30

    }
}
