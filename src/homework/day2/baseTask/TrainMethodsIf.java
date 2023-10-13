package homework.day2.baseTask;

public class TrainMethodsIf {

    public static void main(String[] args) {

        new TrainMethodsIf().returnNewInt(7);
        new TrainMethodsIf().returnNewLong(3000);
        new TrainMethodsIf().returnNewChar('g');
        new TrainMethodsIf().returnNewFloat(34.456f);
        new TrainMethodsIf().returnNewDouble(38000);
        new TrainMethodsIf().returnNewBoolean(true);

    }

    public int returnNewInt(int x) {

        if (x < 8) {
            return x * 8;
        } else {
            return x / 4;
        }
    }

    public long returnNewLong(int x) {

        if (x > 300) {
            return x - 300;
        } else {
            return x + 20;
        }
    }

    public String returnNewChar(char x) {
        if (x == 'g') {
            return "go";
        } else {
            return "o" + x;
        }
    }

    public float returnNewFloat(float x) {
        if (x == 0.67) {
            return x;
        } else {
            return x * 2;
        }
    }

    public double returnNewDouble(double x) {
        if (x > 30 || x < 80) {
            return x + 87;
        } else if (x > 80 || x < 400) {
            return x - 87;
        } else if (x > 400) {
            return x / 4;
        } else {
            return x;
        }
    }

    public void returnNewBoolean(boolean value) {
        if (value) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }

    }

}
