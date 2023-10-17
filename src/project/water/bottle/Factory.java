package project.water.bottle;

import project.water.SparklingWater;

public class Factory {
    public static void main(String[] args) throws InterruptedException {

        Bottle bottle1 = new Bottle(0.05);
        Bottle bottle2 = new Bottle(0.1);
        Bottle bottle3 = new Bottle(0.2);

        SparklingWater sparklingWater1 = new SparklingWater();
        SparklingWater sparklingWater2 = new SparklingWater();
        SparklingWater sparklingWater3 = new SparklingWater();

        sparklingWater1.setTemperature(12);
        sparklingWater2.setTemperature(18);
        sparklingWater3.setTemperature(25);

        bottle1.setWater(sparklingWater1);
        bottle2.setWater(sparklingWater2);
        bottle3.setWater(sparklingWater3);

        bottle1.setBubbles();
        bottle2.setBubbles();
        bottle3.setBubbles();

        bottle1.open();
        bottle2.open();
        bottle3.open();

    }
}






