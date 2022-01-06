package chapter19;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        System.out.println("nacahlni razmer massiva al: " + al.size());
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("razmer spisochnogo massiva al " + "posle vvoda elementov" + al.size());
        System.out.println("soderjimoe spisochnogo massiva al: "+al);
        al.remove("F");
        al.remove(2);
        System.out.println("razmer massiva al posle udaleniya elementov: "+al.size());
        System.out.println("soderjimoe massiva al: "+al);
    }
}
