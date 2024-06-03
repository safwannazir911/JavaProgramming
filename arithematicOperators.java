import java.util.Scanner;

public class arithematicOperators {
    
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);

        // Input first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // Input second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Addition
        double sum = num1 + num2;
        System.out.println("Sum: " + sum);

        // Subtraction
        double difference = num1 - num2;
        System.out.println("Difference: " + difference);

        // Multiplication
        double product = num1 * num2;
        System.out.println("Product: " + product);

        scanner.close();

    }
}
