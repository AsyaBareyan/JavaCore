package homework.thread;

import java.util.List;

public class MyThread implements Runnable {
    //    public static AtomicInteger countOfKeyword = new AtomicInteger();
    //    private String path;
    private List<String> sublist;
    private String keyword;
    Thread t;

    public MyThread(List<String> sublist, String keyword) {
//        this.path = path;
        this.sublist = sublist;
        this.keyword = keyword;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        for (String s : sublist) {
            if (s.contains(keyword)) {
                MultiThreadRead.countOfKeyword.incrementAndGet();
            }

        }

    }
}