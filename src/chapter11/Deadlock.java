package chapter11;

public class Deadlock implements Runnable{
    A a=new A();
    B b=new B();
    Deadlock(){
        Thread.currentThread().setName("glavni potok");
        Thread t=new Thread(this,"sopernichayushi potok");
        t.start();

        a.foo(b);
        System.out.println("nazad v glavni potok");
    }
    @Override
    public void run() {
        b.bar(a);
        System.out.println("nazad v drugoi potok");

    }

    public static void main(String[] args) {
        new Deadlock();
    }
}
