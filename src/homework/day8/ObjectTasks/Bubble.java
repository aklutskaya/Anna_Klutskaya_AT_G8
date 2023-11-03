package homework.day8.ObjectTasks;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Bubble {

    private int volume;
    private String name;

    public Bubble(int volume, String name) {
        this.volume = volume;
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bubble{" +
                "volume=" + volume +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bubble bubble)) return false;
        return volume == bubble.volume && Objects.equals(name, bubble.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume, name);
    }

    public static void main(String[] args) {

        List<Bubble> bubbles = Arrays.asList
                (new Bubble(2, "CO2"), new Bubble(4, "O2"), new Bubble(5, "CO"));

//        Проитерировать список через for-each и отпечатать объемы в консоль через пробел

        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getVolume() + " ");
        }
        System.out.println();

//        Проитерировать список через for-each и отпечатать имена в консоль через пробел

        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getName() + " ");
        }
        System.out.println();

//        Посчитать объем всех пузырей и вывести число в консоль

        int volumeSum = 0;
        for (Bubble bubble : bubbles) {
            volumeSum += bubble.getVolume();
        }
        System.out.println("Объем всех пузырей: " + volumeSum);

//        Проитерировать список по индексу и отпечатать пузыри (.toString()) в консоль с новой строки

        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i).toString());
        }

    }
}
