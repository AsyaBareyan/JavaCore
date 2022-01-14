package homework.thread;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MultiThreadRead {
    public static String path = "C:\\Users\\Asya\\Downloads\\sample.txt";
    public static AtomicInteger countOfKeyword = new AtomicInteger();

    public static void main(String[] args) throws IOException {
        long count = Files.lines(Paths.get(path)).count();
        String keyword = ";";
        System.out.println("all lines:" + count);

        List<String> strings = Files.readAllLines(Paths.get(path));
        List<String> subList = strings.subList(0, 862158);
        List<String> subList1 = strings.subList(862158, 1724316);
        List<String> subList2 = strings.subList(1724316, 2586474);  //ok?bravo merci shat xndrem
        List<String> subList3 = strings.subList(2586474, 3448632);

        long currentTime = System.currentTimeMillis();
        MyThread thread = new MyThread(subList, keyword);
        MyThread thread1 = new MyThread(subList1, keyword);
        MyThread thread2 = new MyThread(subList2, keyword);
        MyThread thread3 = new MyThread(subList3, keyword);
        try {
            thread.t.join();
            thread1.t.join();
            thread2.t.join();
            thread3.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("found lines :" + countOfKeyword);
        long finishTime = System.currentTimeMillis();
        System.out.println("time: " + (finishTime - currentTime));
    }

}
