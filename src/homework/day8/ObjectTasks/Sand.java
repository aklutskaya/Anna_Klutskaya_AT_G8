package homework.day8.ObjectTasks;

import java.util.*;

public class Sand {

    private int weight;
    private String name;

    public Sand(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sand{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sand sand)) return false;
        return weight == sand.weight && Objects.equals(name, sand.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, name);
    }

    public static void main(String[] args) {

        List<Sand> sandbox = new ArrayList<>();

        sandbox.add(new Sand(2, "Речной"));
        sandbox.add(new Sand(4, "Речной"));
        sandbox.add(new Sand(2, "Карьерный"));
        sandbox.add(new Sand(7, "Речной"));

//        Проитерировать список через for-each и отпечатать вес в консоль через пробел

        for (Sand sand : sandbox) {
            System.out.print(sand.weight + " ");
        }
        System.out.println();

//        Проитерировать список через for-each и отпечатать имена в консоль через пробел

        for (Sand sand : sandbox) {
            System.out.print(sand.name + " ");
        }
        System.out.println();

//        Создать пустую карту, где ключом является целое число, а значением объект песка
//        Заполнить карту значениями из предыдущего списка, используя в качестве ключа любое уникальное число

        Map<Integer, Sand> sandMap = new HashMap<>();

        int key = 1;
        for (Sand sand : sandbox) {
            sandMap.put(key++, sand);
        }

//        Проитерировать карту и отпечатать ключи в консоль

        for (int keyMap : sandMap.keySet()) {
            System.out.print(keyMap + " ");
        }
        System.out.println();

//        Проитерировать карту и отпечатать значения в консоль

        for (Sand sand : sandMap.values()) {
            System.out.print(sand.name + " ");
        }
        System.out.println();

//        Проитерировать карту и отпечатать пары ключ-значение в консоль

        for (Map.Entry<Integer, Sand> entry : sandMap.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue().getName());
        }
    }
}
