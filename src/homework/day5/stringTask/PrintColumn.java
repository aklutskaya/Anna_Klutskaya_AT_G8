package homework.day5.stringTask;

public class PrintColumn {

    public void column(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }

    public static void main(String[] args) {
        PrintColumn printColumn = new PrintColumn();
        printColumn.column("Вывод букв");

    }
}
