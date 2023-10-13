package homework.day2.baseTask.cycletask;

import java.util.Arrays;
import java.util.Collections;

public class ArrayCycleDecreasing {

    public void arrayPrintDecreasing() {

        Integer[] array = {78, 23, 54, 12, 65, 45, 98};

        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("print position: " + Arrays.toString(array));

    }

}
