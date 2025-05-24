package collection;

import java.util.*;

public class Excercise2 {
    public static void main(String[] args) {
//       hashSetDemo(args);
       sortedSetDemo(args);
    }

    private static void hashSetDemo(String[] args) {
        Set<String> s = new HashSet<String>();
        for (String a : args)
            s.add(a);
        System.out.println(s.size() + " distinct words: " + s);
    }

    private static void sortedSetDemo(String[] args) {
        Comparator<String> compare = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.toLowerCase().compareTo(o2.toLowerCase());
            }
        };

        SortedSet<String> s = new TreeSet<>(compare);
        for (String a : args)
            s.add(a);
        System.out.println(s.size() + " distinct words: " + s);
    }
}
