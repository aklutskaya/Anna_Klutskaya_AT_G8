package homework.day8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiguresTask {

    public static void main(String[] args) {

        List<String> figures = Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");
        List<String> arrayFigures = new ArrayList<>(figures);

        try (FileWriter writer = new FileWriter("figure.txt")) {
            for (String figure : arrayFigures) {
                writer.write(figure);
                writer.write("-");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        int count = 0;
        for (String element : arrayFigures) {
            if (!element.contains("и")) {
                count++;
            }
        }
        System.out.print(count);
        System.out.println();

        for (int i = 0; i < arrayFigures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }
        System.out.println();

        arrayFigures.add(3, "Треугольник");

        for (String f : arrayFigures) {
            System.out.print(f + " ");
        }
    }
}
