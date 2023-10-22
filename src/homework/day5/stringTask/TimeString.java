package homework.day5.stringTask;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeString {

    public void timeStringPrint(String format) throws ParseException {

        String oldDateString = format;

        SimpleDateFormat oldDateFormat = new SimpleDateFormat("HH.mm dd.MM.yyyy");
        SimpleDateFormat newDateFormat = new SimpleDateFormat("MMMM, d, yyyy HH:mm");

        Date date = oldDateFormat.parse(oldDateString);
        String result = newDateFormat.format(date);
        System.out.println(result);
    }
}
