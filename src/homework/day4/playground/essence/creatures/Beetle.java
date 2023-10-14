package homework.day4.playground.essence.creatures;

public class Beetle extends Insect {
    public Beetle(int mass, String name) {
        super(mass, name);
    }

    public void nest(Carrot home) {
        if (this.getMass() < home.getMass()) {
            int divisionPart = home.getMass() / this.getMass();
            String message = String.format("I am %s and I will nest there with %s my family members!", name, divisionPart);
            System.out.println(message);
        } else {
            System.out.println("This carrot is too small for nesting :(\n");
        }
    }
}
