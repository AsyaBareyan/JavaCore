package homework.file;

import java.io.File;
import java.util.Scanner;

public class ContentSearch {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please input path for folder");
        String pathStr = scanner.nextLine();
        File path = new File(pathStr);
        if (!path.exists() && path.isFile()) {
            System.err.println("Path doesn't exists or not directory");
        } else {
            System.out.println("Please input file's keyword");
            String keyword = scanner.nextLine();
            findFile(path, keyword);
        }
    }

    static void findFile(File parent, String keyword) {
        for (File file : parent.listFiles()) {
            if (file.isDirectory()) {
                findFile(file, keyword);
            } else {
                if (file.getName().endsWith(".txt")) {
                    FileUtil.findLines(file,keyword);
                }

            }
        }
    }
}
