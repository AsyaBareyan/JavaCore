package homework.file;

import java.io.*;

public class FileUtil {

    public static void findLines(File txtPath, String keyword) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(txtPath))) {

            String line = "";
            int lineNumber = 1;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(keyword)) {
                    System.out.println(txtPath.getAbsolutePath() + ": line " + lineNumber);
                    break;
                }
                lineNumber++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void printSizeOfPackage(String path) {
        File file = new File(path);
        int sum = 0;
        if (file.exists() && file.isDirectory()) {
            for (File listFile : file.listFiles()) {
                sum += listFile.length();

            }
            System.out.println(sum / 1024 / 1024 + "Mb");
        }
    }

    public static void createFileWithContent(String path, String fileName, String content) {
        File file = new File(path);
        if (file.exists() && file.isDirectory()) {
            File file1 = new File(path, fileName);
            if (!file1.exists()) {
                try {
                    file1.createNewFile();
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(file1))) {
                        bw.write(content);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {

                System.err.println("File does not exist or not directory");
            }
        }


    }

}
