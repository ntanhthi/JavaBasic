package lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaExpression4 {

    public static void main(String[] args) {

        List<String> languages = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");

        // Using Lambda expression
        languages.forEach(n -> System.out.println(n));
    }
}