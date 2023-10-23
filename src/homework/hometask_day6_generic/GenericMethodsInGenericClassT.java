package homework.hometask_day6_generic;

public class GenericMethodsInGenericClassT<T> {

    public void genericMethodOneGenArg(T value) {
        String className = value.getClass().getName();
        System.out.println("I am an object of" + " " + className + "class");
    }

    public String genericMethodTwoGenArgs(T arg1, T arg2) {

        String name1 = arg1.getClass().getName();
        String name2 = arg2.getClass().getName();
        return "We are objects of" + " " + name1 + " " + " " + "class and" + " " + name2 + " " + "class";

    }

    public void genericMethodHalfGenArgs(T arg, String text) {

        String str = text;
        String className = arg.getClass().getName();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }
        System.out.println("I got an object of" + " " + className + " " + "class and string with" + " " + count + " " + "characters");

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
