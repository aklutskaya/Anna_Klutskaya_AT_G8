package homework.day8.ListTasks;

import java.util.Arrays;
import java.util.List;

public class TaskNine {

    public static void main(String[] args) {

        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        for (double doubleElement : doubles) {
            System.out.print(doubleElement + " ");
        }
        System.out.println();

        double count = 1.0;
        for (double doubleElement : doubles) {
            count *= doubleElement;
        }
        System.out.println("Произведение всех чисел: " + count);

        double sum = 0;
        for (double doubleElement : doubles) {
            sum += doubleElement - (int) doubleElement;
        }
        System.out.println("Сумма всех дробных частей: " + sum);

        for (int i = 0; i < doubles.size(); i++) {
            System.out.print(doubles.get(i) + " ");
        }
    }
}
