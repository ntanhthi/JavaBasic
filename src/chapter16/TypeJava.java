package chapter16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TypeJava {
    //public static void main(String[] args) {
    //    List<List<String>> names = new ArrayList<List<String>>();
    //    names.add(Arrays.asList("Khanh", "Thanh", "Tan"));

    //    names.forEach(i -> i.forEach(System.out::println));
    //}
    public static void main(String[] args) {
        var names = new ArrayList<List<String>>();
        names.add(Arrays.asList("Khanh", "Thanh", "Tan"));

        names.forEach(l -> l.forEach(System.out::println));
    }
}
