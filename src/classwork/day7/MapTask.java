package classwork.day7;

import java.util.HashMap;
import java.util.Map;

public class MapTask {

    public static void main(String[] args) {

        String[] array = "мама мыла раму мыла".split(" ");
        Map<Integer, String> words = new HashMap<>();

        for (int i = 0; i <= args.length; i++) {
            words.put(i, array[i]);
        }

        for (int k : words.keySet()) {
            System.out.println(k);
        }

        for (String s : words.values()) {
            System.out.println(s);
        }

        for (Map.Entry<Integer, String> entry : words.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }


    }
}
