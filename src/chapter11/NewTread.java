package chapter11;

public class NewTread implements Runnable {
    Thread t;

    NewTread() {
        t = new Thread(this, "demo potok");
        System.out.println("dochernoi potok sozdan: " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("dochernoi potok " + i);

                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("dochernoi potok prervan");
        }
        System.out.println("dochernoi potok zavershen");

    }
}
