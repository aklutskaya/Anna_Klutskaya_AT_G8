package BaseTask;

public class Bee {

    String gender;
    long weight;

    public Bee(String gender, Long weight) {
        this.gender = gender;
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public long getWeight() {
        return weight;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public void printBeeDetails() {

        System.out.println("Я легче лося в " + 500 / weight + "раз");
    }

    public static void main(String[] args) {

        new Bee("жен", 3L).printBeeDetails();
    }

}
