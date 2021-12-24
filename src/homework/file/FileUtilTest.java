package homework.file;

import java.util.Scanner;

public class FileUtilTest {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please input path");
//        FileUtil fileUtil=new FileUtil();
        String txtPath = scanner.nextLine();
//        FileUtil.printSizeOfPackage(txtPath);
        System.out.println("Please input KEYWORD for search");
        String keyword=scanner.nextLine();
        System.out.println("Please input content for write in file");
        String content=scanner.nextLine();
        FileUtil.creatFileWithContent(txtPath,keyword,content);
    }
}
