package homework.day4.playground.essence.creatures;

import homework.day4.playground.essence.Matter;

public abstract class Vertebrata extends Animal {


    public Vertebrata(int mass, String name) {
        super(mass, name);
    }

    public void eat(Insect food) {
        String message = String.format("I am %s and I am eating %s", name, food.getName());
        System.out.println(message);
    }
}
    public class Pigeon extends Vertebrata {
        public Pigeon(int mass, String name) {
            super(mass, name);
        }
    }

    public class Raven extends Vertebrata {
        public Raven(int mass, String name) {
            super(mass, name);
        }
    }

    public class Crocodile extends Vertebrata implements Crawlable {

        public Crocodile(int mass, String name) {
            super(mass, name);
        }
    }

}
