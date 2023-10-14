package homework.day4.playground.essence.craft.field;

import homework.day4.playground.essence.Matter;
import homework.day4.playground.essence.craft.Transportable;
import homework.day4.playground.essence.craft.air.AirVehicles;

import java.io.IOException;
import java.nio.CharBuffer;

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

    public class Car extends Vehicle implements Transportable, Readable {

        public Car(int mass, String name) {
            super(mass, name);
        }

    }

    public class Motorbike extends Vehicle implements Transportable, Readable {

        public Motorbike(int mass, String name) {
            super(mass, name);
        }
    }

    public class Moped extends Vehicle implements Transportable, Readable {

        public Moped(int mass, String name) {
            super(mass, name);
        }
    }

}
