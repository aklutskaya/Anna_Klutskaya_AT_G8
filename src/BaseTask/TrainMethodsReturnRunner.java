package BaseTask;

public class TrainMethodsReturnRunner {

    public static void main(String[] args) {

        TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();

        int intResult = trainMethodsReturn.returnNewInt(5);
        System.out.println("метод returnNewInt вернул " + intResult);

        long longResult = trainMethodsReturn.returnNewLong(10995111);
        System.out.println("метод returnNewLong вернул " + longResult);

        String charResult = trainMethodsReturn.returnNewChar('A');
        System.out.println("метод returnNewChar вернул " + charResult);

        float floatResult = trainMethodsReturn.returnNewFloat(34.456f);
        System.out.println("метод returnNewFloat вернул " + floatResult);

        double doubleResult = trainMethodsReturn.returnNewDouble(3.45);
        System.out.println("метод returnNewDouble вернул " + doubleResult);

        int shortResult = trainMethodsReturn.returnNewShort(3280);
        System.out.println("метод returnNewShort вернул " + shortResult);

        int byteResult = trainMethodsReturn.returnNewByte(2);
        System.out.println("метод returnNewByte вернул " + byteResult);

        boolean booleanResult = trainMethodsReturn.returnNewBoolean(true);
        System.out.println("метод returnNewBoolean вернул " + booleanResult);


    }


}
