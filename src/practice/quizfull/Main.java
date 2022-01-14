package practice.quizfull;

public class Main {
    public static void main(String[] args) {
        Integer i=new Integer("10");
        if (i.toString().intern()==i.toString().intern()){
            System.out.println("ravnii");
        }else {
            System.out.println("neravnii");
        }
    }
}
