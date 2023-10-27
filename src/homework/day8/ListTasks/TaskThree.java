package homework.day8.ListTasks;

import java.util.ArrayList;
import java.util.List;

public class TaskThree {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        for (String city : cities) {
            System.out.println(city);
        }

        int letters = 0;
        for (String city : cities) {
            letters += city.length();
        }
        System.out.println(letters);

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
    }
}
