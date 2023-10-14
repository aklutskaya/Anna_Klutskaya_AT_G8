package homework.day4.playground.essence.craft.air;

import homework.day4.playground.essence.Flyable;
import homework.day4.playground.essence.Matter;
import homework.day4.playground.essence.craft.Transportable;
import homework.day4.playground.essence.creatures.Vegetable;

public abstract class AirVehicles extends Matter {

    protected String name;

    public AirVehicles(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Airplane extends AirVehicles implements Flyable, Transportable {

        public Airplane(int mass, String name) {
            super(mass, name);
        }
    }

    public class Copter extends AirVehicles implements Flyable, Transportable {

        public Copter(int mass, String name) {
            super(mass, name);
        }
    }

    public class Rocket extends AirVehicles implements Flyable, Transportable {

        public Rocket(int mass, String name) {
            super(mass, name);
        }
    }
}
