package project.water.bottle;

import project.water.Bubble;
import project.water.SparklingWater;

public class Runner {
    public static void main(String[] args) {
        Bubble[] bubbles = new Bubble[10000];
        for (int i = 0; i < 10000; i++) {
            bubbles[i] = new Bubble("CO2");
        }

        SparklingWater sparklingWater1 = new SparklingWater("Clear", "Transparent", "Neutral", 34.0);
        SparklingWater sparklingWater2 = new SparklingWater("Yellow", "Slightly cloudy", "Citrus", 9.0);
        SparklingWater sparklingWater3 = new SparklingWater("Blue", "Very clear", "Mint", 4565.0);

        sparklingWater1.pump(bubbles);
        sparklingWater2.pump(bubbles);
        sparklingWater3.pump(bubbles);

        Bottle bottle1 = new Bottle(0.5, sparklingWater1);
        Bottle bottle2 = new Bottle(1.0, sparklingWater2);
        Bottle bottle3 = new Bottle(1.5, sparklingWater3);

        bottle1.open();
        bottle2.open();
        bottle3.open();
    }
}






