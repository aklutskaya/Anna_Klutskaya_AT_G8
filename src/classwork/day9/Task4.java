package classwork.day9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        List<PersonTask> people = Arrays.asList(
                new PersonTask("Вася", 13, PersonTask.Sex.MAN),
                new PersonTask("Катя", 28, PersonTask.Sex.WOMEN),
                new PersonTask("Вова", 24, PersonTask.Sex.MAN),
                new PersonTask("Маша", 38, PersonTask.Sex.WOMEN),
                new PersonTask("Роман Петрович", 72, PersonTask.Sex.MAN));

        list.stream().sorted().toList().forEach(System.out::println);
        System.out.println();
        list.stream().sorted((x,y) -> -x.compareTo(y)).distinct().toList().forEach(System.out::println);
        System.out.println();

        people.stream().sorted((p1,p2) -> {
            if (p1.sex != p2.sex) {
                return p1.sex.compareTo(p2.sex);
            }
            return p1.age - p2.age;
        }).peek(p -> System.out.println(p.name)).toList();

    }


}
