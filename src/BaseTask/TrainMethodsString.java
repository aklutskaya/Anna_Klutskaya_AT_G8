package BaseTask;

public class TrainMethodsString {

    String name;

    public static void main(String[] args) {
        new TrainMethodsString().printMama();
        new TrainMethodsString().printPapa();
        new TrainMethodsString().printString();
        new TrainMethodsString().printMamaString();
    }
    public void printMama() {
        System.out.println("Мама мыла раму");
    }

    public void printPapa() {
        System.out.println("Папа мыл раму");

    }

    public void printString() {

        TrainMethodsString trainMethodsString = new TrainMethodsString();
        System.out.println(trainMethodsString.name);

    }

    public void printMamaString() {

        String text = "мама мыла";

        TrainMethodsString trainMethodsString = new TrainMethodsString();
        System.out.println(text + trainMethodsString.name);

    }
}
