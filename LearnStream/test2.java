package LearnStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class test2 {
    public static void main(String[] args) {

        String str="Educnext technologies";
        Map<String, Long> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.forEach((k,val)->{
            System.out.println(k+" :present"+val+" :times");
        });


    }
}
