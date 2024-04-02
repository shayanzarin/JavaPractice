package java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
@interface NonNull {}
public class NotPredicate {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", " ", "", "d");

        List<String> strings1 = strings.stream().filter(Predicate.not(String::isBlank)).toList();
        strings1.forEach(System.out::println);

        List<String> strings2 = Arrays.asList("java", "html", "php");

        String str = strings2.stream()
                .map((@NonNull var v) -> v.toUpperCase())
                .collect(Collectors.joining(", "));

        System.out.println(str);

    }
}
