package homework.day5.stringTask;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {

    public void currentTimePrint() {

        SimpleDateFormat formatter = new SimpleDateFormat("d MMMM, yyy, k часа m минут");
        Date date = new Date(System.currentTimeMillis());
        System.out.println("Сейчас на дворе: " + formatter.format(date));
    }
}
