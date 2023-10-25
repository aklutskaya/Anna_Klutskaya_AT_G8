package homework.day6.generic;

import java.util.Scanner;

public class ScanMethod {

    public void scanPrintMethod() {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            System.out.printf("Hello, I just got %s from you!", s);
            if (s.equalsIgnoreCase("stop")) {
                return;
            }
        }

    }

    public static void main(String[] args) {
        new ScanMethod().scanPrintMethod();
    }
}
