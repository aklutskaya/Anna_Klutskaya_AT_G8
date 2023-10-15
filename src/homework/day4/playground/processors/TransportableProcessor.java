package homework.day4.playground.processors;

import homework.day4.playground.essence.craft.Transportable;
import homework.day4.playground.utils.CoordinatesGenerator;

public class TransportableProcessor {

    public void runTransportable(Transportable transportable, int pointA, int pointB) {

        int moveDirection = transportable.move(pointA, pointB);

        String printDirection = String.format("Transportable %s was moved to %s points", getClass().getSimpleName(), moveDirection);
        System.out.println(printDirection);

    }

    public void runTransportable(Transportable transportable) {

        int pointA = CoordinatesGenerator.generateCoordinate();
        int pointB = CoordinatesGenerator.generateCoordinate();
        int moveDirection = transportable.move(pointA, pointB);

        String printDirection = String.format("Transportable %s was moved to %s points", getClass().getSimpleName(), moveDirection);
        System.out.println(printDirection);

    }
}
