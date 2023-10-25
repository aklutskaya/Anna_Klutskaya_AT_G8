package homework.day6.generic;

public class GenericMethodsInGenericClassTwoParams<X,Y> {

    public String genericMethodGenArgs(X argX,Y argY) {

        return String.format("I received %s arguments of type: %s class, %s class", 2, argX.getClass().getSimpleName(),
                argY.getClass().getSimpleName());

    }

    public String genericMethodGenArgs(X arg) {
        return String.format("I received %s arguments of type: %s class", 1, arg.getClass().getSimpleName());

    }

    public void  genericMethodHalfGenArgs(X arg1, Y arg2, String str) {
        int strLength = str.length();
        String s = String.format("I got an object of  %s class and %s class and string with %s characters",
                arg1.getClass().getSimpleName(), arg2.getClass().getSimpleName(), strLength);

        System.out.println(s);

    }

    public void genericMethodHalfGenArgs(Y arg2, String str) {
        int strLength = str.length();
        String s = String.format("I got an object of %s class and string with %s characters", arg2.getClass().getSimpleName(), strLength);
        System.out.println(s);

    }



    public static void main(String[] args) {
        GenericMethodsInGenericClassTwoParams<String, Integer> instance = new GenericMethodsInGenericClassTwoParams<>();

        String result1 = instance.genericMethodGenArgs("Hello");
        String result2 = instance.genericMethodGenArgs("Hello", 45);

        System.out.println(result1);
        System.out.println(result2);

        instance.genericMethodHalfGenArgs(25, "World");
        instance.genericMethodHalfGenArgs(String.valueOf(65), 76, "Hello Java");
    }

}
