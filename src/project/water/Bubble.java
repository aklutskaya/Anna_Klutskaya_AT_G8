package project.water;

public class Bubble {
    private double volume = 0.3;
    private String gas;

    public Bubble(String gas) {
        this.gas = gas;
    }

    public double getVolume() {
        return volume;
    }

    public void cramp() {
        System.out.println("Cramp!");
    }

}
