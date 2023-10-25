package homework.day7;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class GetFileTask {

    public static void main(String[] args) {
        String path = "/home/aklutskaya/";

        File dir = new File(path);

        if (dir.exists()) {
            File[] dirFiles = dir.listFiles();
            if (dirFiles != null) {
                for (File dirFile : dirFiles) {
                    if (dirFile.isFile()) {
                        System.out.println(dirFile.getName());
                    } else if (dirFile.isDirectory()) {
                        System.out.println(dirFile.getName());
                    }
                }
            } else {
                System.out.println("Нет такого пути");
            }
        }
    }
}
