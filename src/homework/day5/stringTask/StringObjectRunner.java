package homework.day5.stringTask;

import java.text.ParseException;

public class StringObjectRunner {

    public static void main(String[] args) throws ParseException {

        new CurrentTime().currentTimePrint();
        new DateGenerator().newDate("Сгенерированная гласная дата: ");
        new FindInteger().integerArray("У пети было 2 яблока, у Маши 4, у Вани 8");
        new PrintColumn().column("Вывод букв");
        new PrintDuplicate().findDuplicates("мама мыла раму мыла");
        new TimeString().timeStringPrint("22.00 07.09.2020");

    }
}
