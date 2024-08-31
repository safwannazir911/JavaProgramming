package exceptionHandeling;

public class throwExample {

    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older");
        }
    }

    public static void main(String[] args) {
        checkAge(3);
    }
}
