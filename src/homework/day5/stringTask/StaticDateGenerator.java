package homework.day5.stringTask;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StaticDateGenerator {
    public static void newDate(String text) {

        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat dateFormat = new SimpleDateFormat("d MMMM");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, 12);
        System.out.println(text + dateFormat.format(calendar.getTime()));
    }
}
