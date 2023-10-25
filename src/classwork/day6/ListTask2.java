package classwork.day6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTask2 {

    public static void main(String[] args) {

        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();

        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            myList1.add("Строка" + i);
        }
        System.out.println(System.currentTimeMillis() - t0);

        long t2 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++){
            myList2.add("Линия" + i);
        }
        System.out.println(System.currentTimeMillis() - t2);


        long t3 = System.currentTimeMillis();
        for (int i = 0; i < myList1.size(); i++) {
        }
        System.out.println(System.currentTimeMillis() - t3);

    }


}
