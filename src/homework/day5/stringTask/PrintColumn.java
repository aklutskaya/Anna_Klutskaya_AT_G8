package homework.day5.stringTask;

public class PrintColumn {

    public void column(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }
}
