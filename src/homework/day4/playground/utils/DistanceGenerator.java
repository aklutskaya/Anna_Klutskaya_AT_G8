package homework.day4.playground.utils;

import homework.day4.playground.essence.creatures.Crawlable;

import java.util.Random;

public class DistanceGenerator {

    public static int generateDistance() {

        Random random = new Random();
        int randomNumber = random.nextInt(99) + 1;
        System.out.println("DistanceGenerator: I have generated distance with value: " + randomNumber);
        return randomNumber;
    }
}
