package chapter11;

public class A {
    synchronized void foo(B b){
        String name=Thread.currentThread().getName();
        System.out.println(name+ " voshel v metod A.foo()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("class A prervan");
        }
        System.out.println(name+" pitaetsya vizvat metod B.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("V metode A.last()");
    }
}
class B{
    synchronized void bar(A a){
        String name=Thread.currentThread().getName();
        System.out.println(name+"voshel v metod B.bar");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("class B prervan");
        }
        System.out.println(name+" pitaetsya vizvatt metod A.last()");
        a.last();
    }

    synchronized void last() {
        System.out.println("V metode A.last()");
    }
}
