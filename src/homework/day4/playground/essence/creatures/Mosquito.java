package homework.day4.playground.essence.creatures;

import homework.day4.playground.essence.Flyable;

public class Mosquito extends Insect implements Flyable {
    public Mosquito(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void fly(String direction) {

        String massage = String.format("I am %s, my name is %s and I amd flying to %s", getClass().getSimpleName(), name, direction);
        System.out.println(massage);

    }
}
