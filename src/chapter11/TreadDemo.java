package chapter11;

public class TreadDemo {
    public static void main(String[] args) {
        new NewTread();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("glavni potok " + i);

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("glavni potok prervan");
        }
        System.out.println("glavni potok zavershen");
    }
}
