package homework.day4.playground.essence.creatures;

public abstract class Vegetable extends Plant {

    public Vegetable(int mass, String name) {
        super(mass, name);
    }

    public class Potato extends Vegetable {
        public Potato(int mass, String name) {
            super(mass, name);
        }
    }

    public class Carrot extends Vegetable {


        public Carrot(int mass, String name) {
            super(mass, name);
        }
    }

    public class Radish extends Vegetable {
        public Radish(int mass, String name) {
            super(mass, name);
        }
    }

}
