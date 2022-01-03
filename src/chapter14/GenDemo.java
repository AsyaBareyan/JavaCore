package chapter14;

public class GenDemo {

    public static void main(String[] args) {

        Gen<Integer> iOb;
        iOb=new Gen<>(88);
        iOb.showType();

        int v= iOb.getob();
        System.out.println("znachenie: "+v);
        System.out.println();

        Gen<String> strOb=new Gen<String>("test obobshenii");
        strOb.showType();

        String str= strOb.getob();
        System.out.println("Znachenie: "+str);
    }
}
