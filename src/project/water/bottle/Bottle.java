package project.water.bottle;

import project.water.SparklingWater;
import project.water.Water;

public class Bottle {

    private double volume;
    private SparklingWater water;

    public Bottle(double volume, SparklingWater water) {
        this.volume = volume;
        this.water = water;
    }

    public void open() {
        while (water.numBubbles > 0) {
            water.degas();
        }
    }
}