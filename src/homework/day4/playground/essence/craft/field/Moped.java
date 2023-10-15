package homework.day4.playground.essence.craft.field;

public class Moped extends Vehicle {
    public Moped(int mass, String name) {
        super(mass, name);
    }

    @Override
    public int move(int pointA, int pointB) {
        String message = String.format("I am %s, my name is %s and I am moving from point A to point %s", getClass().getSimpleName(), name, pointA, pointB);
        System.out.println(message);
        return pointB - pointA;
    }
}
