package homework.day8.ObjectTasks;

import java.util.*;

public class Chair {

    private int height;
    private int width;

    public Chair(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chair chair)) return false;
        return height == chair.height && width == chair.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width);
    }

    public static void main(String[] args) {

        List<Chair> furniture = Arrays.asList(
                new Chair(1, 2),
                new Chair(4, 2),
                new Chair(2, 4));

//        Проитерировать список через for-each и отпечатать произведение высоты на ширину в консоль через пробел

        for (Chair chair : furniture) {
            System.out.print(chair.height * chair.width + " ");
        }
        System.out.println();

//        Создать пустую карту, где ключом является целое число, а значением объект стула
//        Заполнить карту значениями из предыдущего списка, используя в качестве ключа любое уникальное число

        Map<Integer, Chair> chairMap = new HashMap<>();

        int key = 1;
        for (Chair chair : furniture) {
            chairMap.put(key++, chair);
        }

//        Проитерировать карту и отпечатать ключи в консоль

        for (int keyMap : chairMap.keySet()) {
            System.out.print(keyMap + " ");
        }
        System.out.println();

//        Проитерировать карту и отпечатать значения в консоль

        for (Chair chair : chairMap.values()) {
            System.out.println(chair.height + "-" + chair.width);
        }
        System.out.println();

//        Проитерировать карту и отпечатать пары ключ-значение в консоль

        for (Map.Entry<Integer, Chair> entry : chairMap.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue().getHeight() + "-" + entry.getValue().getWidth());
        }
    }
}
