package homework.day2.baseTask.cycletask;

import java.util.Arrays;

public class ArrayCyclePosition {

    public void arrayPrintPosition() {

        int[] array = new int[]{78, 23, 54, 12, 65, 45, 98};

        int minValue = array[0];
        array[0] = array[6];
        array[6] = minValue;
        System.out.println("change position: " + Arrays.toString(array));
    }
}
