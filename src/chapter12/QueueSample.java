package chapter12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueSample {
    public static void main(String[] args) {

        Queue fruit = new LinkedList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);

        fruit.remove();
        System.out.println(fruit);
        System.out.println(fruit.peek());

    }

}

