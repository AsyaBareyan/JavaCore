package homework.file;

import java.io.File;
import java.util.Scanner;

public class FileSearch {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please input path for folder");
        String pathStr = scanner.nextLine();
        File path = new File(pathStr);
        if (!path.exists() || path.isFile()) {
            System.out.println("Path does not exists");
        } else {
            System.out.println("Please input file name");
            String fileName = scanner.nextLine();
            findFile(path, fileName);
        }
    }

    static void findFile(File parent, String fileName) {
        boolean isFound = false;
        for (File file : parent.listFiles()) {
            if (file.isDirectory()) {
                findFile(file, fileName);
            } else {
                if (file.getName().contains(fileName)) {
                    System.out.println(file.getAbsolutePath());
                }

            }
        }
    }
}

