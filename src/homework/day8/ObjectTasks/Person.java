package homework.day8.ObjectTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {

    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person(32, "Коля"));
        people.add(new Person(24, "Оля"));
        people.add(new Person(55, "Вася"));
        people.add(new Person(63, "Маша"));

//        Проитерировать список через for-each и отпечатать возраст в консоль через пробел

        for (Person person : people) {
            System.out.print(person.age + " ");
        }
        System.out.println();

//        Проитерировать список через for-each и отпечатать имена в консоль через пробел

        for (Person person : people) {
            System.out.print(person.name + " ");
        }
        System.out.println();

//        Проитерировать список по индексу и отпечатать людей (.toString()) в консоль с новой строки

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).toString());
        }
    }
}
