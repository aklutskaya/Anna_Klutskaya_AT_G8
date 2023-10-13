package homework.day2.baseTask;

public class TrainMethodsPrimitive {

    public static void main(String[] args) {
        new TrainMethodsPrimitive().printInt();
        new TrainMethodsPrimitive().printLong();
        new TrainMethodsPrimitive().printChar();
        new TrainMethodsPrimitive().printFloat();
        new TrainMethodsPrimitive().printDouble();
        new TrainMethodsPrimitive().printShort();
        new TrainMethodsPrimitive().printByte();
        new TrainMethodsPrimitive().printBoolean();
    }

    public void printInt() {
        int little = 104850;
        System.out.println(little + "я получил на вход число");
    }

    public void printLong() {
        long big = 10995111;
        System.out.println(big + "я получил на вход  длинное число");
    }

    public void printChar() {
        char min = 103;
        System.out.println(min + "я получил на вход символ");
    }

    public void printFloat() {
        float f = 34.456f;
        System.out.println(f + "я получил на вход дробное число");
    }

    public void printDouble() {
        double d = 3.45;
        System.out.println(d + "я получил на вход длинное дробное число");
    }

    public void printShort() {
        short s = 3280;
        System.out.println(s + "я получил на вход короткое число");
    }

    public void printByte() {
        byte b = 1;
        System.out.println(b + "я получил на вход очень короткое число");
    }

    public void printBoolean() {
        boolean bool = true;
        System.out.println(bool + "я получил на вход булево");
    }
}
