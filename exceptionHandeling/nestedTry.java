package exceptionHandeling;

public class nestedTry {

    public static void main(String[] args) {
        try {
            int x = 33 / 0;
            try {
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Outer catch: " + e.getMessage());
        }

    }

}
