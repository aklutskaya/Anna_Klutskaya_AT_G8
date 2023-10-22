package classwork;

import java.util.ArrayList;
import java.util.List;

public class ListTask {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        String[] words = "мама мыла раму".split("//n");

        for (String word : words) {
            myList.add(word);
            System.out.println();
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        for (String list : myList) {
            System.out.println(list);
        }

    }

}
