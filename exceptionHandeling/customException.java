package exceptionHandeling;

public class customException extends Exception {
    public customException(String message) {
        super(message);
    }

    public static void checkValue(int value) throws customException {
        if (value < 0) {
            throw new customException("Value cannot be negative");
        }
    }

    public static void main(String[] args) {
        try {
            checkValue(-1);
            System.out.println("Value is non-negative");
        } catch (customException e) {
            System.out.println(e.getMessage());
        }
    }
}
