package classwork.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        list.stream().findFirst().orElse("мама");
        list.stream().filter("мама"::equals).findFirst().get();
        list.stream().skip(4).findFirst().get();
        list.stream().skip(2).limit(2).collect(Collectors.toList());
        list.stream().filter(s -> s.contains("м")).distinct().collect(Collectors.toList());
    }
}
