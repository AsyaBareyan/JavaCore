package chapter11;

public class DemoJoin {
    public static void main(String[] args) {
        NewTread1 ob1=new NewTread1("Odin");
        NewTread1 ob2=new NewTread1("dva");
        NewTread1 ob3=new NewTread1("tri");
        System.out.println("potok odin zapushen: "+ob1.t.isAlive());
        System.out.println("potok dva zapushen: "+ob2.t.isAlive());
        System.out.println("potok tri zapushen: "+ob3.t.isAlive());
        System.out.println("glavni potok zavershen");

    }
}
