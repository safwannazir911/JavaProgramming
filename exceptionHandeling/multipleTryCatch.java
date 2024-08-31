package exceptionHandeling;

public class multipleTryCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = { 1, 2, 3 };
            System.out.println(numbers[1] / 0); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        } catch (Exception e) {
            System.out.println("An error occurred");
        }

    }
}
