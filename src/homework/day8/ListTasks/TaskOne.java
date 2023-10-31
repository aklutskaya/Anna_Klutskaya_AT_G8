package homework.day8.ListTasks;

import java.util.ArrayList;
import java.util.List;

public class TaskOne {
    public static void main(String[] args) {

        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        for (String butterfly : butterflies) {
            System.out.print("\"" + butterfly + "\"");
        }
        System.out.println();

        int count = 0;
        for (String element : butterflies) {
            if (element.contains("o")) {
                count++;
            }
        }
        System.out.print("Количество о в бабочках: " + count);
        System.out.println();

        for (int i = 0; i < butterflies.size(); i++) {
            System.out.print(butterflies.get(i) + " ");
        }
        System.out.println();

        for (String fly : butterflies) {
            System.out.println(fly);
        }
    }
}
