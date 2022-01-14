package practice.quizfull;

public class D {
    public static void main(String[] args) {
        E e=new E();
        e.someVariable=100;
        e.doIt(e);
        System.out.println(e.someVariable);
    }
}
class E{
    public int someVariable=10;
    public void doIt(E aE){
        aE.someVariable++;
    }
    E(){

    }
}