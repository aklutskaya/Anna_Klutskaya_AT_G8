package homework.day9;

import java.util.stream.Stream;

public class CountriesRunner {

    public static void main(String[] args) {

//        Создать поток данных стрингов countries из 4 стран (Андора, Португалия, Англия, Замбия) (через Stream.of())
//        Отфильтровать страны, которые содержат в себе хотя бы одну гласную букву
//        Отфильтровать страны, в названии которых меньше 7 букв
//        Перевести все страны в верхний регистр
//        Добавить к каждому названию кавычки
//        Отпечатать в консоль с новой строки

        Stream.of("Андора", "Португалия", "Англия", "Замбия")
                .filter(country -> country.matches(".*[аеёиоуыэюяAEIOUY].*")).filter(country -> country.length() < 7)
                .map(String::toUpperCase).map(country -> "\"" + country + "\"").toList().forEach(System.out::println);
    }
}
