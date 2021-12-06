package chapter9;

public class Client implements Callback {
    public void callback(int p) {
        System.out.println("metod callback() , " + " vizivaemi so znacheniem " + p);
    }

    void nonIfaceMeth() {
        System.out.println("v klassax realiziruyushix interfacei, " + " mogut opred i dr chleni. ");
    }
}

