package homework.day5.stringTask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindInteger {
    int a;

    public void integerArray(String text) {

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void main(String[] args) {
        FindInteger findInteger = new FindInteger();
        findInteger.integerArray("У пети было 2 яблока, у Маши 4, у Вани 8");
    }
}
