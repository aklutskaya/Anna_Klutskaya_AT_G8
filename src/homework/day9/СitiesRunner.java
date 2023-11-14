package homework.day9;

import java.util.ArrayList;
import java.util.List;

public class СitiesRunner {

    public static void main(String[] args) {

//        Создать пустой список стрингов cities (через new ArrayList)

        List<String> cities = new ArrayList<>();

        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

//        Посчитать сумму всех буков во всех словах и вывести число в консоль

        System.out.println(cities.stream().mapToInt(String::length).sum());

    }
}
