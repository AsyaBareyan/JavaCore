package practice.quizfull;


import java.util.*;

public class Clazz {
    public static void main(String[] args) {
        List arrayList=new ArrayList();
        arrayList.add("str1");
        arrayList.add("str2");
        arrayList.add("str3");
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.remove(i);

        }
        System.out.println(arrayList.size());
    }
}
