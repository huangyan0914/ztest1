package org.example.generictype;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class GenericTypeTest2 {

    public static  <E extends Comparable<? super E>> E max(List<E> e1) {
        if (e1 == null){
            return null;
        }
        //迭代器返回的元素属于 E 的某个子类型
        Iterator<? extends E> iterator = e1.iterator();
        E result = iterator.next();
        while (iterator.hasNext()){
            E next = iterator.next();
            if (next.compareTo(result) > 0){
                result = next;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        GrandSon grandSon = new GrandSon();
        List<GrandSon> grandSonList = new ArrayList<>();
        grandSonList.add(grandSon);

//        max(grandSonList);

//        Child child = new Child();
//        child.com

        List<String> list = new ArrayList<>();
        list.add("xxx");

        Collection<String> collection = list;
        System.out.println(JSON.toJSONString(collection));

//        List<Child> childList = new ArrayList<>();
//        childList.add(new Child());
//        List<Parent> parentList = childList;


        Child[] childArr = new Child[1];
        childArr[0] = new Child();
        Parent[] parentArr = childArr;
    }

    private static <T extends Number> double add(T a, T b) {
        System.out.println(a + "+" + b + "=" + (a.doubleValue() + b.doubleValue()));
        return a.doubleValue() + b.doubleValue();
    }

    private static double add2(Number a, Number b) {
        System.out.println(a + "+" + b + "=" + (a.doubleValue() + b.doubleValue()));
        return a.doubleValue() + b.doubleValue();
    }
}
