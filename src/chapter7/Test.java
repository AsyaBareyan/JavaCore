package chapter7;

public class Test {
    int a, b;
    void meth(int i, int j){
        i*=2;
        j/=2;
    }
    Test(){

    }
    Test(int i,int j){
        a=i;
        b=j;
    }
    void meth(Test o){
        o.a*=2;
        o.b/=2;
    }

}
