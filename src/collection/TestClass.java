package collection;

import java.util.*;

public class TestClass {
    public static  void main(String a[])
    {
        List list1 = new ArrayList<>();
        List list2 = new ArrayList<>();
        list1.add(101);
        list1.add(102);
        list1.add(1033);
        list2.add("List2Element1");
        list2.add("List2Element2");
        list2.add("List2Element3");
        System.out.println("List 1:"+list1);
        System.out.println("List 2:" +list2);
        List list3 = new ArrayList();
        list3.addAll(list1);
        list3.addAll(list2);
        list3.add("List3Element1");
        list3.add("List3Element2");
        System.out.println("List 3:"+list3);
    }
}
