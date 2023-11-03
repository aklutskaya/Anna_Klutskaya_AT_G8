package homework.day8.ObjectTasks;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Water {

    private String color;
    private String smell;

    public Water(String color, String smell) {
        this.color = color;
        this.smell = smell;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    @Override
    public String toString() {
        return "Water{" +
                "color='" + color + '\'' +
                ", smell='" + smell + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Water water)) return false;
        return Objects.equals(color, water.color) && Objects.equals(smell, water.smell);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, smell);
    }

    public static void main(String[] args) {

        List<Water> water = Arrays.asList(
                new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный")
        );

//        Проитерировать список через for-each и отпечатать пары цвет-вода через тире в консоль с новой строки

        for (Water element : water) {
            System.out.println(element.color + "-" + element.smell);
        }
    }
}
