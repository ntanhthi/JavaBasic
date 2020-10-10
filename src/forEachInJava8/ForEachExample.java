package forEachInJava8;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");

        System.out.println("Iterating by passing lambda expression: ");
        languages.forEach(i -> System.out.println(i));

        System.out.println("Iterating by passing method reference: ");
        languages.forEach(System.out::println);
    }
}
