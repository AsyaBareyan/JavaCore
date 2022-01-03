package chapter14;

public class SimpGen {
    private static Object Integer;

    public static void main(String[] args) {
        TwoGen<Integer,String>tgObj=new TwoGen<Integer,String>(88,"obobsheniya");
        tgObj.showTypes();
        int v=tgObj.getOb1();
        System.out.println("znachenie: "+v);

        String str= tgObj.getOb2();
        System.out.println("znachenie: "+str);

    }
}
