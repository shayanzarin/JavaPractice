package java11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String sample=" abcd ";
        System.out.println(sample.repeat(1));
        System.out.println(sample.strip());
        System.out.println(sample.stripLeading());
        System.out.println(sample.stripTrailing());

        sample = "this\nis\na\ntest.";

        List<String> strings = new ArrayList<>();
        sample.lines().forEach(strings::add);
        strings.forEach(System.out::println);


        List<String> strings1 = Arrays.asList("a","b","c");
        String[] arrays = strings1.toArray(new String[strings1.size()]);
        Arrays.stream(arrays).forEach(a -> System.out.printf("%s", a));
        System.out.println();

        String[] arrays2 = strings1.toArray(String[]::new);
        Arrays.stream(arrays2).forEach(a -> System.out.printf("%s", a));


    }
}
