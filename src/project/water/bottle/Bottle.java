package project.water.bottle;

import project.water.Bubble;
import project.water.Water;

public class Bottle {

    private double volume;
    private Water water;

    public Bottle(double volume) {
        System.out.printf("Bottle with a volume of %.2f liters.%n", volume);
        this.volume = volume;
    }

    public void open() throws InterruptedException {
        System.out.println("Opening the bottle and releasing gas");
        if (water != null) {
            water.setOpened();

        }
    }

    public void warm(int temperature) {
        if (water != null) {
            water.setTemperature(temperature);
        }

    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        System.out.println("Adding water to the bottle.");
        this.water = water;
    }

    public void setBubbles() {
        if (water != null) {
            int countBubbles = (int) (volume * 10000);
            Bubble[] bubbles = new Bubble[countBubbles];
            for (int i = 0; i < countBubbles; i++){
                bubbles[i] = new Bubble("Gas");
            }
            water.pump(bubbles);
            System.out.println("Filling the water with bubbles.");
        }

    }


}