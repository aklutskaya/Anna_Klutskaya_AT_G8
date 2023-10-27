package homework.day8.ListTasks;

import java.util.ArrayList;
import java.util.List;

public class TaskSeven {

    public static void main(String[] args) {

        List<String> elements = new ArrayList<>();
        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        for (String element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();

        int count = 0;
        for (String element : elements) {
            if (element.contains("-") || element.contains(" ")) {
                count++;
            }
        }
        System.out.print("Количество элементов с более чем одним словом: " + count);
        System.out.println();

        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }
        System.out.println();

        elements.add(4, "Spinner");
        elements.remove(2);
        elements.set(5, "Switch");

        for (String element : elements) {
            System.out.print(element + " ");
        }

    }
}
