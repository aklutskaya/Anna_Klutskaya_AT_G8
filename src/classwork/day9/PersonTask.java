package classwork.day9;

import homework.day8.ObjectTasks.Person;

import java.util.Arrays;
import java.util.List;

public class PersonTask {

    public String name;
    public int age;
    public Sex sex;

    public PersonTask(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public enum Sex {
        MAN, WOMEN
    }

    public static void main(String[] args) {

        List<PersonTask> list = Arrays.asList(
                new PersonTask("Вася", 13, Sex.MAN),
                new PersonTask("Катя", 28, Sex.WOMEN),
                new PersonTask("Вова", 24, Sex.MAN),
                new PersonTask("Маша", 38, Sex.WOMEN),
                new PersonTask("Роман Петрович", 72, Sex.MAN));

        list.stream().filter(x -> x.age >= 18).filter(x ->(x.age < 55) || (x.sex == Sex.MAN && x.age < 60)).count();

        int count = 0;
        for (PersonTask p : list) {
            if ((p.age >= 18 && p.age < 55) || (p.sex == Sex.MAN && p.age > 18 && p.age < 60)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
