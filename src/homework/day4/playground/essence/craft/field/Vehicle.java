package homework.day4.playground.essence.craft.field;

import homework.day4.playground.essence.Matter;
import homework.day4.playground.essence.craft.air.AirVehicles;

public abstract class Vehicle extends Matter {

    protected String name;

    public Vehicle(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Car extends Vehicle {

    }

    public class Motorbike extends Vehicle {

    }

    public class Moped extends Vehicle {

    }

}
