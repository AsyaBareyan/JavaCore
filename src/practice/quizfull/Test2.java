package practice.quizfull;

public class Test2 {
    private String name;
    Test2(String name){
        this.name=name;

    }
    public void test(Test2 test){
        test=new Test2("three");

    }
    public String toString(){
        return name;
    }

    public static void main(String[] args) {
        Test2 t1=new Test2("one");
        Test2 t2=new Test2("two");
        t1.test(t2);
        System.out.println(t2);
    }
}
