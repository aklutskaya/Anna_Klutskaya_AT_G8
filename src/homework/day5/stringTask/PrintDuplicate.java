package homework.day5.stringTask;

import java.util.*;
import java.util.stream.Collectors;

public class PrintDuplicate {

    public void findDuplicates(String text) {
        String[] dup = text.split(" ");

        for (int i = 0; i < dup.length; i++) {
            for (int a = i + 1; a < dup.length; a++) {
                if (dup[i].equals(dup[a])) {
                    System.out.println(dup[i]);
                }
            }
        }

    }

    public static void main(String[] args) {

        PrintDuplicate printDuplicate = new PrintDuplicate();
        printDuplicate.findDuplicates("мама мыла раму мыла");

    }
}
