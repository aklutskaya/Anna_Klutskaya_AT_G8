package classwork;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashTask {
    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();
        String[] words = "мама мыла раму мыла".split(" ");

        for (String word : words) {
            mySet.add(word);
        }

        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String set : mySet) {
            System.out.println(set);
        }

    }
}
