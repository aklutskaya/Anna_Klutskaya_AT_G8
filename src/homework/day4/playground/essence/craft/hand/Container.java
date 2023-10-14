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


    public class Bottle extends Container implements Storable{

        public Bottle(int mass, String name) {
            super(mass, name);
        }
    }

    public class Mug extends Container {

        public Mug(int mass, String name) {
            super(mass, name);
        }
    }

    public class Can extends Container implements Storable{

        public Can(int mass, String name) {
            super(mass, name);
        }
    }
}
