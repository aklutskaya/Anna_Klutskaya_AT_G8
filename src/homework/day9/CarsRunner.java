package homework.day9;

import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarsRunner {

    public static void main(String[] args) {

//        Создать поток данных стрингов из 7 авто (Мерс, Ауди, Жигуль, Рено, Жигуль, Жигуль, Ауди) (через Stream.of())
//        Отфильтровать только те названия, которые содержат букву "и"
//        Пропустить 1 название
//        Все названия привести в верхний регистр

        Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди")
                .filter(car -> car.contains("и")).skip(1).map(String::toUpperCase).forEach(System.out::println);
    }
}
