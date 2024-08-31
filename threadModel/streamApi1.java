package threadModel;

import java.util.Arrays;
import java.util.List;

public class streamApi1 {
        public static void main(String[] args) {
                List<String> list = Arrays.asList("Apple", "Banana", "Orange", "Mango", "Pineapple");

                // Print all elements
                list.stream().forEach(System.out::println);

                // Filter and print elements starting with 'A'
                list.stream()
                                .filter(s -> s.startsWith("A"))
                                .forEach(System.out::println);

                // Map to uppercase and print
                list.stream()
                                .map(String::toUpperCase)
                                .forEach(System.out::println);

                // Sum of all elements
                List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

                // Sum of all elements
                int sum = numbers.stream()
                                .reduce(0, Integer::sum);

                System.out.println("Sum: " + sum);
        }
}
