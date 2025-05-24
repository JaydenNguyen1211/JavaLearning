package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> distincWords = new HashSet<>(Arrays.asList(args));
        System.out.println(distincWords.size() + " distinct words " + distincWords);
    }
}
