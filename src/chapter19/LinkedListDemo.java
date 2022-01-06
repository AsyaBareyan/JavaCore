package chapter19;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String>ll=new LinkedList<>();
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");

        ll.add(1,"A2");
        System.out.println("isxodnoe soderj svyazannogo spiska ll: "+ll);
        ll.remove("F");
        ll.remove(2);
        System.out.println("soderj spiska posle udaleniya: "+ll);
        ll.removeFirst();
        ll.removeLast();

        String val=ll.get(2);
        ll.set(2,val+" izmeneno");
        System.out.println("soderjimoe posle izmeneniya: "+ll);
    }
}
