package org.example.generictype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author huangyan
 */
public class GenericTypeTestMain {
    public static <clz> void main(String[] args) {

        Child[] children = new Child[2];

        Parent[] parents = new Parent[2];

//        System.out.println(children instanceof Parent[].class);

        System.out.println(parents.getClass());
        System.out.println(children.getClass());

//        System.out.println(children.getClass().isAssignableFrom(parents.getClass()));
        System.out.println(parents.getClass().isAssignableFrom(children.getClass()));

        System.out.println("END");
        Class<? extends Parent[]> clz = parents.getClass();
//        System.out.println(children instanceof Exception);
        System.out.println("END");

//        Number[] num = new Integer[10];
//        num[0] = 2.1;
//
//
//        List<Integer> integerList = new ArrayList<>();
//        List<Number> numa = integerList;

        System.out.println(Parent[].class.isAssignableFrom(Child[].class));

//        Object[] arr1 = new Integer[3];
//        arr1[0] = 11;
//        arr1[1] = "aa";
//        System.out.println("tt");


        Map<String, String>[] wp = new HashMap[5];

        List[] ga = (List<Integer>[])new ArrayList[10];

//        Class.forName("aaa");

        List<Parent> parentList = new ArrayList<>();
        List<Child> childList = new ArrayList<>();

        Child aChild = new Child();
        parentList.add(aChild);
        childList.add(aChild);

        funA(parentList);
        funA(childList);

    }

    public static void funA(List<? extends Parent> list) {
        System.out.println("funA-"+list);
    }
}
