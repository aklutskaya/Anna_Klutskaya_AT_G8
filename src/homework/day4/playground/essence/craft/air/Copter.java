package homework.day4.playground.essence.craft.air;

public class Copter extends AirCraft {
    public Copter(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void fly(String direction) {

        String massage = String.format("I am %s, my name is %s and I amd flying to %s", getClass().getSimpleName(), name, direction);
        System.out.println(massage);

    }

    @Override
    public int move(int pointA, int pointB) {

        String message = String.format("I am %s, my name is %s and I am moving from point A to point %s", getClass().getSimpleName(), name, pointA, pointB);
        System.out.println(message);
        return pointB - pointA;
    }
}
