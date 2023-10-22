package homework.day5.stringTask;

import java.text.ParseException;

public class StringStaticRunner {
    public static void main(String[] args) throws ParseException {

        StaticCurrentTime.currentTimePrint();
        StaticDateGenerator.newDate("Сгенерированная гласная дата: ");
        StaticFindInteger.integerArray("У пети было 2 яблока, у Маши 4, у Вани 8");
        StaticPrintColumn.column("Вывод букв");
        StaticPrintDuplicate.findDuplicates("мама мыла раму мыла");
        StaticTimeString.timeStringPrint("22.00 07.09.2020");

    }
}
