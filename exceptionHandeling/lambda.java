package exceptionHandeling;

import java.util.Arrays;
import java.util.List;

public class lambda {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach((n) -> System.out.println(n));
        numbers.forEach(System.out::println); // Method Reference

        int[] arr = { 1, 2, 3, 4, 5 };
        Arrays.stream(arr).forEach(n -> System.out.println(n));

    }
}
