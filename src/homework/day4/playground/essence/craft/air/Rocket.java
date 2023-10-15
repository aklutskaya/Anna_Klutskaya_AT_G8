package homework.day4.playground.essence.craft.air;

public class Rocket extends AirCraft {
    public Rocket(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void fly(String direction) {

        String massage = String.format("I am %s, my name is %s and I amd flying to %s", getClass().getSimpleName(), name, direction);
        System.out.println(massage);

    }
}
