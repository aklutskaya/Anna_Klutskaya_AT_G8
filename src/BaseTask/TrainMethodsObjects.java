package BaseTask;

public class TrainMethodsObjects {

    public void processMouse(Mouse mouse) {
        System.out.println(mouse.name + mouse.age);
        mouse.printMouseDetails();
    }

    public void processSouce(Souce souce) {
        System.out.println(souce.name + souce.color);
        souce.printSouceDetails();
    }

    public void processBee(Bee bee) {
        System.out.println(bee.gender + bee.weight);
        bee.printBeeDetails();
    }

    public void processObstacle(Obstacle obstacle) {
        System.out.println(obstacle.description + obstacle.severity);
        obstacle.printObstacleDetails();
    }

    public void processPineapple(Pineapple pineapple) {
        System.out.println(pineapple.grade + pineapple.heatCapacity);
        pineapple.printPineappleDetails();
    }

}
