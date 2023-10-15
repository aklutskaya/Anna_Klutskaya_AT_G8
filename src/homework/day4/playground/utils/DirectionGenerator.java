package homework.day4.playground.utils;

import java.util.Random;

public class DirectionGenerator {

    public static String generateDirection() {

        Random random = new Random();
        int randomNumber = random.nextInt(39) + 1;

        if (randomNumber <= 9) {
            return "NORTH";
        } else if (randomNumber <= 19) {
            return "SOUTH";
        } else if (randomNumber <= 29) {
            return "WEST";
        } else {
            return "EAST";
        }
    }
}
