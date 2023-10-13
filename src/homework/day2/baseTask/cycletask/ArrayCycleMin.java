package homework.day2.baseTask.cycletask;

public class ArrayCycleMin {

    public void arrayPrintMin() {

        int[] array = new int[]{78, 23, 54, 12, 65, 45, 98};

        int minValue = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        System.out.println("min value: " + minValue);
        System.out.println("min index: " + minIndex);
    }
}
