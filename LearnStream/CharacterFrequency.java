package LearnStream;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "examplestring";
//        Map<Character, Long> frequencyMap = input.chars()
//                .mapToObj(c -> (char) c) // Convert int stream to Character stream
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        Map<String, Long> collect = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print the frequency of each character
//        collect.forEach((character, count) ->
//                System.out.println(character + ": " + count));


        //find duplicate element in za string
//        List<String> collect1 = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
//        System.out.println(collect1 );


        //find unique element in za string
//        List<String> collect2 = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().map(Map.Entry::getKey).collect(Collectors.toList());
//        System.out.println(collect2 );

        //find first non repeat element in a string
//        String key = Arrays.stream(input.split(""))
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(x -> x.getValue() == 1)
//                .findFirst().get().getKey();
//        System.out.println(key );

        String key2 = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .map(x -> x.getKey())
                .findFirst()
                .orElse(null);

        System.out.println(key2 );



    }

}