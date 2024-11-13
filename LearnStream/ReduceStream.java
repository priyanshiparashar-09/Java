package LearnStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceStream {
    public static void main(String[] args) {
        // Creating list of integers
        List<Integer> numbers = Arrays.asList(-2, 0, 4, 6, 8);

        // Using reduce to find the sum of all elements
        int sum = numbers.stream()
                .reduce(0, (element1, element2) -> element1 + element2);

        // Displaying the sum of all elements
        System.out.println("The sum of all elements is " + sum);

        String[] array = { "Geeks", "for", "Geeks" };

        // Using reduce to concatenate strings with a hyphen
        Optional<String> combinedString = Arrays.stream(array)
                .reduce((str1, str2) -> str1 + "-" + str2);

        // Displaying the combined String
        combinedString.ifPresent(System.out::println);
    }
}
