package homework.day9;

import java.util.stream.Stream;

public class FiguresRunner {

    public static void main(String[] args) {

//        Заменить каждое слово на целое число, соответствующее количеству буков в слове
//        Отфильтровать числа, которые больше 4
//        Отпечатать все оставшиеся числа в консоль

        Stream.of("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс")
                .map(String::length).filter(length -> length > 4).toList().forEach(System.out::println);
    }
}
