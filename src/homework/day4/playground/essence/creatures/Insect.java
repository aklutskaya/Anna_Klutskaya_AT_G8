package homework.day4.playground.essence.creatures;

public abstract class Insect extends Animal{


    public Insect(int mass, String name) {
        super(mass, name);
    }

    public class Beetle extends Insect {

        public Beetle(int mass, String name) {
            super(mass, name);
        }

        public void nest(Vegetable.Carrot home) {

            if (this.getMass() < home.getMass()) {
                int nestDivision = home.getMass() / this.getMass();
                String message = String.format("I am %s and I will nest there with %d my family members!", name, nestDivision);
            }else {
                System.out.println("This carrot is too small for nesting");
            }

        }
    }

    public class Fly extends Insect {
    }


}
