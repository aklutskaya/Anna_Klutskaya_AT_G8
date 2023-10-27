package homework.day8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarTask {

    public static void main(String[] args) {

        List<String> cars = new ArrayList<>();
        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

        try (FileWriter writer = new FileWriter("cars.txt")) {
            for (String car : cars) {
                writer.write("\"" + car + "\"\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < cars.size(); i++) {
            int count = cars.get(i).length();
            if (count > 4) {
                cars.remove(i);
                i--;
            }
        }

        for (String car : cars) {
            System.out.println(car + " ");
        }

    }
}
