package homework.day6.generic;

public class GenericMethodsInGenericClassT<T> {

    public void genericMethodOneGenArg(T value) {
        String className = value.getClass().getSimpleName();
        System.out.println("I am an object of" + " " + className + " " + "class");
    }

    public String genericMethodTwoGenArgs(T arg1, T arg2) {

        String name1 = arg1.getClass().getSimpleName();
        String name2 = arg2.getClass().getSimpleName();
        return String.format("We are objects of %s class and %s class", name1, name2);

    }

    public void genericMethodHalfGenArgs(T arg, String text) {

        String str = text;
        String className = arg.getClass().getSimpleName();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }
        String s = String.format("I got an object of %s class and string with %s characters", className, count);
        System.out.println(s);

    }

    public static void main(String[] args) {

        GenericMethodsInGenericClassT<String> stringContainer = new GenericMethodsInGenericClassT<>();
        stringContainer.genericMethodOneGenArg("");

        String result = stringContainer.genericMethodTwoGenArgs(" ", " ");
        System.out.println(result);

        String str = "Мама мыла раму";
        stringContainer.genericMethodHalfGenArgs(" ", str);
    }

}
