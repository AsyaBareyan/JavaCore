package chapter11;

public class MyTread extends Thread{
    MyTread(){
        super("demo potok");
        System.out.println("dochernoi potok: "+this);
        start();
    }
    public void run(){
        try {
            for (int i = 5; i >0; i--) {
                System.out.println("dochernoi potok: "+i);
                Thread.sleep(500);

            }
        }catch (InterruptedException e){
            System.out.println("doch potok prervan");
        }
        System.out.println("doch potok zavershen");
    }

}
