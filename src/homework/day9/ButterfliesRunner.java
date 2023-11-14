package homework.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ButterfliesRunner {

    public static void main(String[] args) {


        List<String> butterflies = new ArrayList<>();

        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

//        Добавить к каждому элементу кавычки
//        Оставить только те слова, которые содержат букву "a" и букву "о"
//        Вывести слова в консоль с новой строки

        butterflies.stream().map(butterfly -> "\"" + butterfly + "\"").filter(butterfly -> butterfly
                .contains("a") && butterfly.contains("o")).toList().forEach(System.out::println);
    }
}
