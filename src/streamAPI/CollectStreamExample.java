package streamAPI;

import java.util.Arrays;
import java.util.List;

public class CollectStreamExample {
    // match() operation returns a boolean depending upon the condition applied on
    // stream data
    public static void main(String[] args) {
        List<String> data = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
        boolean result = data.stream().anyMatch((v) -> v.equalsIgnoreCase("Java"));
        System.out.println(result); // true
    }
}
