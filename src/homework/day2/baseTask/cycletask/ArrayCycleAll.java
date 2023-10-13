package homework.day2.baseTask.cycletask;

import java.util.Random;

public class ArrayCycleAll {

    public void arrayPrintAll() {

        int n = 7;
        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(n);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            array[i] *= 5;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            array[i] = array[i] * array[i];
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }

}