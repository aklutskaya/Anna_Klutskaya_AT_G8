package cycletask;

import java.util.Random;

public class ArrayCycle {

    public void arrayNew() {

        int n = 7;

        int[] array = new int[n];
        Random random = new Random();


        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(n);
            System.out.println(array[i]);
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        for (int i = 0; i < n; i++) {
            array[i] *= 5;
            System.out.println(array[i]);
        }

        for (int i = 0; i < n; i++) {

            array[i] = array[i] * array[i];
            System.out.println(array[i]);
        }

    }


}
