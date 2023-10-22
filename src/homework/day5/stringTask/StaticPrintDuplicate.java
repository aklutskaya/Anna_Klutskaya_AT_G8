package homework.day5.stringTask;

public class StaticPrintDuplicate {

    public static void findDuplicates(String text) {

        String[] dup = text.split(" ");
        for (int i = 0; i < dup.length; i++) {
            for (int a = i + 1; a < dup.length; a++) {
                if (dup[i].equals(dup[a])) {
                    System.out.println(dup[i]);
                }
            }
        }
    }
}
