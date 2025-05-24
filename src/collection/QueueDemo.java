package collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        basicOperation(args);
    }

    public static void basicOperation(String[] args) {
        Queue<String> strQueue = new PriorityQueue<>();

        for (String str: args) {
            strQueue.offer(str);
        }

        for (Iterator iterator = strQueue.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
    }

    public static void basicDequeueOperation() {

    }
}
