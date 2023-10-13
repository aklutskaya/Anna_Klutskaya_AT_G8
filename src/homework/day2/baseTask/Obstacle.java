package homework.day2.baseTask;

public class Obstacle {

    String description;
    String severity;

    public Obstacle(String description, String severity) {
        this.description = description;
        this.severity = severity;
    }

    public String getDescription() {
        return description;
    }

    public String getSeverity() {
        return severity;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public void printObstacleDetails() {
        System.out.println("Возникло" + description + "препятствиие" + severity);
    }

    public static void main(String[] args) {

        new Obstacle("новое", "котрое усложняет дорогу").printObstacleDetails();
    }


}
