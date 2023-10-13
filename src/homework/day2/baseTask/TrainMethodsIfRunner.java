package homework.day2.baseTask;

public class TrainMethodsIfRunner {

    public static void main(String[] args) {

        TrainMethodsIf trainMethodsIf = new TrainMethodsIf();

        int intResult = trainMethodsIf.returnNewInt(7);
        System.out.println("метод returnNewInt вернул: " + intResult);

        long intLong = trainMethodsIf.returnNewLong(3000);
        System.out.println("метод returnNewLong вернул: " + intLong);

        String intChar = trainMethodsIf.returnNewChar('m');
        System.out.println("метод returnNewChar вернул: " + intChar);

        float intFloat = trainMethodsIf.returnNewFloat(34.456f);
        System.out.println("метод returnNewFloat вернул: " + intFloat);

        double intDouble = trainMethodsIf.returnNewDouble(38000);
        System.out.println("метод returnNewDouble вернул: " + intDouble);
    }
}
