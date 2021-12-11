package chapter10;

public class ThrowDemo {
    static void demoproc(){
        try {
            throw new NullPointerException("demonstracia");
        }catch (NullPointerException e){
            System.out.println("isklyuchenie perexvacheno v tele "+
                    "metoda demoproc().");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }catch (NullPointerException e){
            System.out.println("povtorni perexvat: "+e);
        }
    }
}
