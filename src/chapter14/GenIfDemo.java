package chapter14;

public class GenIfDemo {
    public static void main(String[] args) {
        Integer[]inums={3,6,2,8,6};
        Character[]chs={'b','r','p','w'};

        MyClass<Integer>iob=new MyClass<Integer>(inums);
        MyClass<Character>cob=new MyClass<Character>(chs);
        System.out.println("max v massive inum: "+iob.max());
        System.out.println("min v massive inum: "+iob.min());
        System.out.println("max v massive chs: "+cob.max());
        System.out.println("min v massive chs: "+cob.min());

    }
}
