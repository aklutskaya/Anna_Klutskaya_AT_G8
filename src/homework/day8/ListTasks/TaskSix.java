package homework.day8.ListTasks;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskSix {
    public static void main(String[] args) {

        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        for (String bird : birds) {
            System.out.println("--" + bird + "--");
        }
        System.out.println();

        int count = 0;
        Pattern pattern = Pattern.compile("[аоуея]");
        for (String bird : birds) {
            Matcher matcher = pattern.matcher(bird);
            int letterCount = 0;
            while (matcher.find()) {
                letterCount++;
            }
            if (letterCount > 1) {
                count++;
            }
        }
        System.out.println("Количество птиц, которые содержат больше одной гласной: " + count);
        System.out.println();

        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }
        System.out.println();

        birds.set(3, "Синица");

        for (String bird : birds) {
            System.out.println(bird);
        }
    }
}