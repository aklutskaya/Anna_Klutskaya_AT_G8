package homework.day2.baseTask;

public class TrainMethodsObjectsRunner {

    public static void main(String[] args) {

        TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();

        Mouse mouse = new Mouse("Tom", 43);
        trainMethodsObjects.processMouse(mouse);

        Souce souce = new Souce("New", "white");
        trainMethodsObjects.processSouce(souce);

        Bee bee = new Bee("male", 3847L);
        trainMethodsObjects.processBee(bee);

        Obstacle obstacle = new Obstacle("Описание", "главное");
        trainMethodsObjects.processObstacle(obstacle);

        Pineapple pineapple = new Pineapple("Киш", 5487);
        trainMethodsObjects.processPineapple(pineapple);
    }
}
