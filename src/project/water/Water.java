package project.water;

public abstract class Water {

    private String color;
    private String transparency;
    private String smell;
    private double temperature;

    public Water(String color, String transparency, String smell, double temperature) {
        this.color = color;
        this.transparency = transparency;
        this.smell = smell;
        this.temperature = temperature;
    }

}
