package homework.day8;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiguresTask {

    public static void main(String[] args) {

        List<String> figures = Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");
//        List<String> arrayFigures = new ArrayList<>(figures);

        try (PrintWriter writer = new PrintWriter("figure.txt")) {
            for (String figure : figures) {
                writer.print(figure);
                if (figures.indexOf(figure) < figures.size() - 1) {
                    writer.print("-");
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int count = 0;
        for (String element : figures) {
            if (!element.contains("и")) {
                count++;
            }
        }
        System.out.print("Вывод количества фигур, которые не содержат 'и': " + count);
        System.out.println();

        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }
        System.out.println();

        figures.set(3, "Треугольник");

        for (String figure : figures) {
            System.out.print(figure + " ");
        }
    }
}
