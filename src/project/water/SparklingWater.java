package project.water;

public class SparklingWater extends Water {

    private Bubble[] bubbles;
    public int numBubbles;

    public SparklingWater(String color, String transparency, String smell, double temperature) {
        super(color, transparency, smell, temperature);
        this.numBubbles = 0;
        this.bubbles = new Bubble[10000];
    }

    public void pump(Bubble[] newBubbles) {
        if (numBubbles + newBubbles.length <= bubbles.length) {
            for (Bubble bubble : newBubbles) {
                bubbles[numBubbles] = bubble;
                numBubbles++;
            }
        }
    }

    public void degas() {
        if (numBubbles > 0) {
            bubbles[numBubbles - 1].burst();
            numBubbles--;
        }
    }
}
