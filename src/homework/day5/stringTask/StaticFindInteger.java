package homework.day5.stringTask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StaticFindInteger {
    public static void integerArray(String text) {

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
