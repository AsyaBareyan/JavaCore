package chapter11;

public class ExtendTread {
    public static void main(String[] args) {
        new MyTread();
        try {
            for (int i = 5; i >0; i--) {
                System.out.println("glavni potok: "+i);
                Thread.sleep(500);

            }
        }catch (InterruptedException e){
            System.out.println("glavni potok prervan");
        }
        System.out.println("glavni potok zavershen");
    }

}
