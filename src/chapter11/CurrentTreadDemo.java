package chapter11;

public class CurrentTreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("tekushi potok" + t);
        t.setName("My Thread");
        System.out.println("posle izmeneniya imya potoka" + t);
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("glavni potok ispolneniya prervan");
        }
    }
}
