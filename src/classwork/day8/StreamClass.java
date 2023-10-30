package classwork.day8;

import java.util.Arrays;
import java.util.List;

public class StreamClass {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        System.out.println(list.stream().filter(x ->x.equals("мама")).count());  //"мама"::equals

    }
}
