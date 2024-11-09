package LearnStream;


import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "example string";
        Map<Character, Long> frequencyMap = input.chars()
                .mapToObj(c -> (char) c) // Convert int stream to Character stream
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print the frequency of each character
        frequencyMap.forEach((character, count) ->
                System.out.println(character + ": " + count));
    }
}