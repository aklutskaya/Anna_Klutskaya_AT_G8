package classwork.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        list.stream().anyMatch(s -> s.equals("мама"));
        list.stream().allMatch(s -> s.contains("м"));
        list.stream().map(s -> s + "м").collect(Collectors.toList());

    }
}
