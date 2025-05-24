package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Excercise1 {
    public static void main(String[] args) {
//        streamDemo(args);
        traditionalDemo(args);
    }

    private static void streamDemo(String[] args) {
        List<String> arguments = Arrays.asList(args);
        Collections.shuffle(arguments);
        arguments.stream()
                .forEach(e ->
                        System.out.println(e)
                        );
    }

    private static void traditionalDemo(String[] args) {
        List<String> arguments = Arrays.asList(args);
        Collections.shuffle(arguments);
        for(String e : arguments) {
            System.out.println(e);
        }
    }
}
