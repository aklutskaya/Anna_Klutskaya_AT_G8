package project.water;

public class SparklingWater extends Water {

    private Bubble[] bubbles;
    private boolean isOpened;

    public SparklingWater() {
        isOpened();
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
        System.out.println("Pumping bubbles into water.");
    }


    private void degas() throws InterruptedException {
        while (isOpened) {
            int temperature = getTemperature();
            int bubbleCount = 10 + 5 * temperature;

            for (int i = 0; i < bubbleCount; i++) {

                if (bubbles != null && i < bubbles.length) {
                    bubbles[i].cramp();
                }

            }
        }
        Thread.sleep(1000);
    }

    public void setOpened() throws InterruptedException {
        System.out.println("Open a bottle.");
        isOpened = true;
        degas();
    }

    public void isOpened() {
        System.out.println("Close Bottle");

    }
}
