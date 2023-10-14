package homework.day4.playground.essence.craft.air;

import homework.day4.playground.essence.Matter;
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

//    public class Airplane extends AirVehicles {
//
//    }

    public class Copter extends AirVehicles {

    }

    public class Rocket extends AirVehicles {

    }
}
