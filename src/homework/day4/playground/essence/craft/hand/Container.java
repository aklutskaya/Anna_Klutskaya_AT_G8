package homework.day4.playground.essence.craft.hand;

import homework.day4.playground.essence.Matter;
import homework.day4.playground.essence.craft.field.Vehicle;

public abstract class Container extends Matter {

    protected String name;

    public Container(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public class Bottle extends Container {

    }

    public class Mug extends Container {

    }

    public class Can extends Container {

    }
}
