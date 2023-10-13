package homework.day2.baseTask.cycletask;

public class CycleTaskRunner {

    public static void main(String[] args) {

        ArrayCycleAll arrayCycle = new ArrayCycleAll();
        arrayCycle.arrayPrintAll();

        ArrayCycleMin arrayCycleMin = new ArrayCycleMin();
        arrayCycleMin.arrayPrintMin();

        ArrayCyclePosition arrayCyclePosition = new ArrayCyclePosition();
        arrayCyclePosition.arrayPrintPosition();

        ArrayCycleDecreasing arrayCycleDecreasing = new ArrayCycleDecreasing();
        arrayCycleDecreasing.arrayPrintDecreasing();


    }

}